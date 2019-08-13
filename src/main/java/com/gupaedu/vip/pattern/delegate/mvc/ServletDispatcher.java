package com.gupaedu.vip.pattern.delegate.mvc;

import com.gupaedu.vip.pattern.delegate.mvc.controller.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xgh
 * @description：相当于项目经理角色
 * @date ：Created in 2019/8/11 20:33
 */
public class ServletDispatcher {
    private static List<Handler> handlerMapping = new ArrayList<>();
    public ServletDispatcher(){
        Class<?> aClass = MemberAction.class;
        try {
            handlerMapping.add(new Handler()
                    .setController(aClass.newInstance())
                    .setMethod(aClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public  void  doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);

    }

    private void  doDispatch(HttpServletRequest request, HttpServletResponse response){
            //1. 获取用户请求的Url
            //按照j2ee 的标准，每个url对于一个servlet，url由浏览器输入
        String uri = request.getRequestURI();
        //2.Servlet拿到url后，要做权衡
            //根据用户请求的url，去找的url对应的某一个java类的方法
            //3.通过拿到的url，去handlerMapper（认为是策略常量）中找
        Handler handler = null;
        for (Handler h:handlerMapping) {
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        Object o = null;
        //4.将具体任务分发到method， 通过反射去调用去对应的方法
        try {
            o =  handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //5.获取到method执行的结果，通过response返回回去
       //  response.getWriter().write(o);
    }


    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
