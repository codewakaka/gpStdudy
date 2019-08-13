package com.gupaedu.vip.pattern.observer.subject;

import com.gupaedu.vip.pattern.observer.core.EventLisenter;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 21:16
 */
public class Subject extends EventLisenter {

    //通常采用动态代理监控，防止代码侵入

    public  void  add(){
        System.out.println("调用添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }
    public  void  remove(){
        System.out.println("调用删除方法");
        trigger(SubjectEventType.ON_RMOVE);
    }
}
