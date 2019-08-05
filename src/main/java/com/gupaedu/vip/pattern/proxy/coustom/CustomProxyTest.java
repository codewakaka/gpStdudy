package com.gupaedu.vip.pattern.proxy.coustom;

import com.gupaedu.vip.pattern.proxy.jdk.JdkMp;
import com.gupaedu.vip.pattern.proxy.jdk.Xm;
import com.gupaedu.vip.pattern.proxy.statics.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/5 22:14
 */
public class CustomProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new CustomMp().getInstance(new Xm());
            System.out.println(obj.getClass());
            obj.findLov();

            //通过反编译查看源代码
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
