package com.gupaedu.vip.pattern.factory.abstr;

/**
 * @author code
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        MilcFactrory factrory = new MilcFactrory();
        //对应用户而言
        //用户只有选择权利，保证了代码的健壮性
        System.out.println(factrory.getMenniu());
    }
}
