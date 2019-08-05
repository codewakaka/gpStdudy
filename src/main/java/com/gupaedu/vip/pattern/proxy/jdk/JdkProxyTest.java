package com.gupaedu.vip.pattern.proxy.jdk;

import com.gupaedu.vip.pattern.proxy.statics.Person;
import sun.misc.ProxyGenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 22:28
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JdkMp().getInstance(new Xm());
            System.out.println(obj.getClass());
            obj.findLov();
            byte[] bytes = ProxyGenerator.generateProxyClass("", new Class[]{Person.class});
            FileOutputStream os =new FileOutputStream("D://$proxy0.class");
            os.write(bytes);
            os.close();
            //1.拿到被代理对象的引用，并且获得它的所有接口
            //2.jdk Proxy类重新生成一个新的类，同时新的类要实现被代理类所有实现
            //动态生成java代码，把新加的业务逻辑方法由一定的逻辑代码去调用
            //编译生成，class
            //在jvm里面运行

            //jdk中，只有是$开头的一般都是自动生成的

            //通过反编译查看源代码
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
