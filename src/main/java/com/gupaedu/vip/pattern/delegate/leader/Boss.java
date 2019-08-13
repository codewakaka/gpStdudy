package com.gupaedu.vip.pattern.delegate.leader;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/11 21:05
 */
public class Boss {
    public static void main(String[] args) {
        //客户请求（Boss），委派者(Leader)，被委派者(Tagget)
        //委派者要持有被委派者的引用
        //代理模式注重的是过程，委派模式的是结果
        //策略模式注重的是可拓展（外部拓展），委派模式注重内部的灵活和复用

        //委派moose：就是静态代理和策略模式一种特殊组合
        new Leader().doing("登陆");
    }
}
