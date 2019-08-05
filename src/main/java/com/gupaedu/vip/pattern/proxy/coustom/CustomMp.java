package com.gupaedu.vip.pattern.proxy.coustom;

import com.gupaedu.vip.pattern.proxy.statics.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/5 22:16
 */
public class CustomMp implements GpInvocationHandler {
    private Person target;

    public Object getInstance(Person target) throws Exception {
        this.target = target;
        Class<? extends Person> clazz = target.getClass();
        return GpProxy.newProxyInstance(new GpClassLoad(), clazz.getInterfaces(), this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk 开始物色");
        method.invoke(this.target, args);
        System.out.println("如果合适开始");
        return null;
    }
}
