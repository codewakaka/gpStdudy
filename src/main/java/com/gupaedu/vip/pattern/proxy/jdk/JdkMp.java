package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:06
 */
public class JdkMp implements InvocationHandler {

    private Person target;
    public Object getInstance(Person target) throws  Exception{
        this.target =target;
        Class<? extends Person> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk 开始物色");
        method.invoke(this.target,args);
        System.out.println("如果合适开始");
        return null;
    }
}
