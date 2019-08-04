package com.gupaedu.vip.pattern.factory.func;

import com.gupaedu.vip.pattern.factory.Milk;
import com.gupaedu.vip.pattern.factory.Yili;

/**
 * @author code
 */
public class YiliFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
