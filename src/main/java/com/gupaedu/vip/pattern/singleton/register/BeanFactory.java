package com.gupaedu.vip.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：xgh
 * @description： spring中的就是用这种注册式单例
 * @date ：Created in 2019/8/3 11:20
 */
public class BeanFactory {
    private BeanFactory(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static  Object getBean(String className){
        if(ioc.containsKey(className)){
           return ioc.get(className);
        }else {
            try {
                Object o = Class.forName(className).newInstance();
               return ioc.put(className,o);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
