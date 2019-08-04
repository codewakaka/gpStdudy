package com.gupaedu.vip.pattern.singleton.hungry;

/**
 * @author ：xgh
 * @description：饿汉式在类加载的时候立即初始化，并且创建单例对象，优点没有加锁，效率高;
 * 用户体验上比懒汉式更好，缺点：不管用不用都创建空间，占用空间，浪费内存
 * 绝对线程安全，在现场没有创建之前就已经实例化了
 * @date ：Created in 2019/7/29 20:33
 */
public class Hungry {
    private Hungry(){}

    //先静态后动态
    //先属性后方法
    //先上后下
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis() +":" +hungry);
        return hungry;
    }

}
