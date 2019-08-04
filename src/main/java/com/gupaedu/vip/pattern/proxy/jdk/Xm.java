package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:04
 */
public class Xm implements Person {
    @Override
    public void  findLov(){
        System.out.println("xm");
        System.out.println("=====111");
    }

    @Override
    public void zhufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买东西");
    }

    @Override
    public void job() {
        System.out.println("找工作");
    }
}
