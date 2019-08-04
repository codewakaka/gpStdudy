package com.gupaedu.vip.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/7/29 21:25
 */
public class RegisterMap {
    private RegisterMap(){};
    private static Map<String,Object> register = new HashMap<>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name) == null){
            try {
                register.put(name,new RegisterMap());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}
