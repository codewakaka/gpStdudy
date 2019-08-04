package com.gupaedu.vip.pattern.factory.func;

/**
 * @author code
 */
public class FactoryTest {
    public static void main(String[] args) {
        //货比三家
        //不知道谁好谁坏
        //配置 可能会配置错
        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk());
    }
}
