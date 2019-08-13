package com.gupaedu.vip.pattern.delegate.leader;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/11 21:05
 */
public class TaegetB implements ITarget{
    @Override
    public void doing(String command) {
        System.out.println("我说员工B,我现在在干==="+command+"===工作");
    }
}
