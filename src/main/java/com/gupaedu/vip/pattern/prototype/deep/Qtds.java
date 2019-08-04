package com.gupaedu.vip.pattern.prototype.deep;

import com.gupaedu.vip.pattern.singleton.seriable.Seriable;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Date;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/7/29 23:05
 */
public class Qtds extends  Monkey implements Cloneable, Serializable {
    private Jkb jkb;

    public Qtds(){
        this.setBirthday(new Date());
    }

    public Jkb getJkb() {
        return jkb;
    }

    public void setJkb(Jkb jkb) {
        this.jkb = jkb;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //   return super.clone();

        return deepClone();
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream ous = new ObjectOutputStream(bos);
            ous.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Qtds o = (Qtds)ois.readObject();
            o.setBirthday(new Date());
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
