package com.gupaedu.vip.pattern.factory.simple;

import com.gupaedu.vip.pattern.factory.Tenlunsu;

/**
 *
 * 小作坊式工厂模型
 * @author code
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //这个new的过程比较复杂
        //System.out.printf(new Tenlunsu().getName());
        //有人民币 不需要自己new，
        //小作坊模式，不用关心过程，只关心结果
        // 假如牛奶 成分配比不一样。
        SimpleFactory factory = new SimpleFactory();
        //把用户需求告诉工厂
        //创建产品的过程隐藏，对于用户来说完成不用知道
        //可能会配置错 aaa
        System.out.println(factory.getMilk("特仑苏"));
    }
}
