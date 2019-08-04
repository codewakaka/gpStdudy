package com.gupaedu.vip.pattern.factory.func;

import com.gupaedu.vip.pattern.factory.Milk;
import com.gupaedu.vip.pattern.factory.Sanlu;

/**
 * @author code
 */
public class SanluFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
