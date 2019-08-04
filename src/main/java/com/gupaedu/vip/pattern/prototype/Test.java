package com.gupaedu.vip.pattern.prototype;

import com.gupaedu.vip.pattern.prototype.deep.Jkb;
import com.gupaedu.vip.pattern.prototype.deep.Qtds;
import com.gupaedu.vip.pattern.prototype.simple.Prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/7/29 22:52
 */
public class Test {
    public static void main(String[] args) {
      /*  Prototype prototype = new Prototype();
        prototype.setName("zs");
        List list = new ArrayList(10);
        list.add("tom");
        prototype.setList(list);
        try {
            Prototype clone =(Prototype) prototype.clone();
            System.out.println(clone == prototype);
           clone.getList().set(0,"tony");
            System.out.println(prototype.getList().get(0));
            System.out.println(clone.getList().get(0) == prototype.getList().get(0));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
*/
        Qtds qtds = new Qtds();
        Jkb jkb = new Jkb();
        jkb.setD(10);
        jkb.setS(20);
        qtds.setJkb(jkb);
        try {
            Qtds clone =(Qtds) qtds.clone();
            System.out.println(clone.getBirthday());
            clone.getJkb().setS(50);
            System.out.println(qtds.getBirthday());
            System.out.println(qtds.getJkb().getS());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
