package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:35
 */
public class Jdk58Test {
    public static void main(String[] args) {
        Person instance =(Person) new Jdk58().getInstance(new Xm());
        instance.job();
    }
}
