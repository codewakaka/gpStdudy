package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:31
 */
public class Jdk58 implements InvocationHandler {
    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class<? extends Person> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this::invoke);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我说58");
        method.invoke(this.target,args);
        System.out.println("合适入职");
        return null;
    }
}
