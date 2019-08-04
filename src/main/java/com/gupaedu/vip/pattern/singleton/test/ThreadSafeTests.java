package com.gupaedu.vip.pattern.singleton.test;

import com.gupaedu.vip.pattern.singleton.hungry.Hungry;
import com.gupaedu.vip.pattern.singleton.lazy.LazyOne;
import com.gupaedu.vip.pattern.singleton.lazy.LazyThree;
import com.gupaedu.vip.pattern.singleton.lazy.LazyTwo;
import com.gupaedu.vip.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @author ：xgh
 * @description：线程安全测试
 * @date ：Created in 2019/7/29 20:37
 */
public class ThreadSafeTests {
    public static void main(String[] args) {
        int count = 200;
        //发令枪
        CountDownLatch latch = new CountDownLatch(count);

      //  final Set<Hungry> syncset = Collections.synchronizedSet(new HashSet<Hungry>());
        long start = System.currentTimeMillis();
        for (int i = 0; i <count ; i++) {
            new Thread(){
                @Override
                public void run() {
                    //
                   // syncset.add(Hungry.getInstance());
                   // Hungry.getInstance();
                    try {
                        //阻塞  count为0，释放所以共享资源
                        latch.await();
                   //     Object obj = LazyOne.getInstance();
                       // Object obj = LazyTwo.getInstance();
                        //必须调用方法
                        Object obj = LazyThree.getInstance();
                        System.out.println(System.currentTimeMillis() +":" + obj);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();//线程每循环一次就启动一个线程，具有一定随机性
            //，每次启动一个线程，count--
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" +(end -start));
    /*    try {
            Class<LazyThree> clazz = LazyThree.class;
            Constructor<?>[] cs = clazz.getDeclaredConstructors();
            for (Constructor c:cs) {
                //强制访问
                c.setAccessible(true);

                Object o = c.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
      //  RegisterEnum.INSTANCE.getInstace();
      /*  Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois .readObject();
            ois.close();

            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
