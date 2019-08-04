package com.gupaedu.vip.pattern.prototype.simple;

import java.util.List;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/7/29 22:50
 */
public class Prototype implements Cloneable {
    private String name;
    private List<String> list ;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
