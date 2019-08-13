package com.gupaedu.vip.pattern.observer.core;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 21:19
 */
public class Event {
    //事件源头
    private Object source;
    //通知目标
    private Object target;
    //回调
    private Method callback;
    //触发
    private String trigger;
    private Date date;

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }


    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "\tsource=" + source +
                ", \ttarget=" + target +
                ", \tcallback=" + callback +
                ", \ttrigger='" + trigger + '\'' +
                '}';
    }
}
