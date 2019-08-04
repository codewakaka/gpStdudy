package com.gupaedu.vip.pattern.proxy.statics;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 21:52
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Father father = new Father( new Son());
        father.findLov();
    }
}
