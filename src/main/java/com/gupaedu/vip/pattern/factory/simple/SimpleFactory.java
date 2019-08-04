package com.gupaedu.vip.pattern.factory.simple;

import com.gupaedu.vip.pattern.factory.Mengniu;
import com.gupaedu.vip.pattern.factory.Milk;
import com.gupaedu.vip.pattern.factory.Tenlunsu;
import com.gupaedu.vip.pattern.factory.Yili;

public class SimpleFactory {
    public Milk getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new Tenlunsu();
        }else if("伊利".equals(name)){
            return   new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        }else {
            System.out.println("不能生成");
            return null;
        }
    }
}
