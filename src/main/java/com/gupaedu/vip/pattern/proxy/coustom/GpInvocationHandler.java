package com.gupaedu.vip.pattern.proxy.coustom;

import java.lang.reflect.Method;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/5 21:10
 */
public interface GpInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
