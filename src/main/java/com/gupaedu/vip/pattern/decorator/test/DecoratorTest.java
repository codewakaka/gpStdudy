package com.gupaedu.vip.pattern.decorator.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 20:27
 */
public class DecoratorTest {
    public static void main(String[] args) {
        //为了某个实现类再不修改原始类的基础上进行动态地覆盖或者增加方法
        //该实现保持跟原有类的层级关系
        //采用装饰模式
        //虽然dataInputSteam 功能强大
        //但是dataInputSteam 同样要实现InputSteam
        InputStream inputStream = null;
        FilterInputStream fis = new DataInputStream(inputStream);
    }
}
