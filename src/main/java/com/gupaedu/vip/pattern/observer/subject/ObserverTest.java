package com.gupaedu.vip.pattern.observer.subject;

import com.gupaedu.vip.pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 21:38
 */
public class ObserverTest
{

    public static void main(String[] args) {
        try {
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice",new Class<?>[]{Event.class});

            Subject subject = new Subject();
            subject.addLisenter(SubjectEventType.ON_ADD,observer,advice);
            subject.addLisenter(SubjectEventType.ON_RMOVE,observer,advice);
            subject.add();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
