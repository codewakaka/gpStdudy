package com.gupaedu.vip.pattern.singleton.lazy;

/**
 * @author ：xgh
 * @description：懒汉
 * @date ：Created in 2019/7/29 20:49
 */
public class LazyOne {
    private LazyOne(){}
    //静态块
    private static LazyOne lazy = null;

    public static LazyOne getInstance() {
        //调用方法之前，先判断
        //如果没有初始化则将其初始化，并赋值
        //将其实例缓存
        if (lazy == null) {
            lazy = new LazyOne();
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return  lazy;
    }

}
