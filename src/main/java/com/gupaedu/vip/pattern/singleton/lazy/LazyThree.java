package com.gupaedu.vip.pattern.singleton.lazy;

/**
 * @author ：xgh
 * @description： 在外部内被掉用的2时候内部类才会被加载
 * 这种 形式兼顾的饿汉式的内存浪费，也兼顾了synchronize的性能问题
 * 内部类一定是要在方法调用之前初始化
 * 避免了线程安全问题
 * @date ：Created in 2019/7/29 21:07
 */
    public class LazyThree {
        private static  boolean initialized = false;
    //默认使用lazyThree的时候会先初始化内部类
    //如果没有使用的话内部类不会加载
    private LazyThree(){
        //
        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例被侵犯");
            }
        }
    };
    //static 是为了使单例的空间能够共享
    //final 保证方法不会被重写不会被重载
    public static final LazyThree getInstance(){
        //在返回结果之前一定会加载内部类再返回
        return LazyHolder.LAZY;
    }

    //静态内部类
    //默认不加载
    private static  class  LazyHolder{
        private static  final  LazyThree LAZY =  new LazyThree();
    }
}
