package com.gupaedu.vip.pattern.singleton.test;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/3 11:02
 */
public class LazyTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {

        }
        long end = System.currentTimeMillis();
        System.out.println(start - end);
    }
}
