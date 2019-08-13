package com.gupaedu.vip.pattern.observer.subject;

import com.gupaedu.vip.pattern.observer.core.Event;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 21:18
 */
public class Observer
{

    public  void  advice(Event e){
        System.out.println("==========触发事件，打印日志==============\n"+e);

        /*
         *input
         *
         * input.addLisenter("")
         * */
    }
}
