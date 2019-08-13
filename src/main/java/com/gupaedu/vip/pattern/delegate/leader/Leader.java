package com.gupaedu.vip.pattern.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/11 21:04
 */
public class Leader implements ITarget{
    private Map<String ,ITarget> targets = new HashMap<>();

    public Leader() {
        targets.put("加密",new TaegetA());
        targets.put("登陆",new TaegetB());
    }

    //自己不干活，分配
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
