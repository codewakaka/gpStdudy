package com.gupaedu.vip.pattern.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 21:25
 */
public class EventLisenter {
    protected Map<Enum,Event> events = new HashMap<>();

    public  void  addLisenter(Enum evenType, Object target, Method callback){
        //注册
        //用反射调用
        events.put(evenType,new Event(target,callback));
    }
    private void  trigger(Event event){
        event.setSource(this);
        event.setDate(new Date());
        try {
            event.getCallback().invoke(event.getTarget(),event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected  void  trigger(Enum call){
        if(!this.events.containsKey(call)){
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));
    }
}
