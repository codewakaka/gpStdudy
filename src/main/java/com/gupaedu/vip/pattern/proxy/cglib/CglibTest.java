package com.gupaedu.vip.pattern.proxy.cglib;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:46
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            Zs instance = (Zs)new CglibMp().getInstance(new Zs().getClass());
            instance.findLov();
            System.out.println("==================");

            //System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
