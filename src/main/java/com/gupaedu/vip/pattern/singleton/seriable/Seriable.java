package com.gupaedu.vip.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author ：xgh
 * @description：反序列化单例破坏
 * @date ：Created in 2019/7/29 21:38
 */
public class Seriable implements Serializable {
    //序列化就是把内存中的状态通过转换字节码的形式
    //从而转化IO流，写入到其他地方（硬盘 ，网络IO）
    //内存状态永久保存

    //反序列化
    //已经持久化的字节码1内容，转化为IO流
    //通过IO流的读取，进而讲读取的内存转换为java对象
    //在转换过程中重新创建对象new
    private Seriable() {
    }

    public final static Seriable INSTANCE = new Seriable();

    public static Seriable getInstance() {
        return INSTANCE;
    }

    //序列化反序列化协议
    private Object readResolve() {
        return INSTANCE;
    }
}
