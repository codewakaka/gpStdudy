package com.gupaedu.vip.pattern.singleton.lazy;

/**
 * @author ：xgh
 * @description：懒汉
 * @date ：Created in 2019/7/29 20:49
 */
public class LazyTwo {
    private LazyTwo(){};
    private static LazyTwo lazy = null;

    public static synchronized LazyTwo getInstance() {
        if (lazy == null) {
            lazy = new LazyTwo();
        }
        return  lazy;
    }

}
