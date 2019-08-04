package com.gupaedu.vip.pattern.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:37
 */
public class CglibMp implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        //要把那个类设置为即将生成的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务增强
        System.out.println("开始物色");
        methodProxy.invokeSuper(o, objects);
        System.out.println("合适就一起");
        return null;
    }
}
