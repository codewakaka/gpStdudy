package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:28
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JdkMp().getInstance(new Xm());
            System.out.println(obj.getClass());
            obj.findLov();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
