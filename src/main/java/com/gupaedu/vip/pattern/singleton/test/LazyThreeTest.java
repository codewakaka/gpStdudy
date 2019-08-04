package com.gupaedu.vip.pattern.singleton.test;

import com.gupaedu.vip.pattern.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/3 11:12
 */
public class LazyThreeTest {
    public static void main(String[] args) {
        try {
            Class<LazyThree> clazz = LazyThree.class;
            //通过反射拿到私有构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
                //强制访问
                c.setAccessible(true);
                //暴力初始化化
                Object o = c.newInstance();
                Object o1 = c.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
