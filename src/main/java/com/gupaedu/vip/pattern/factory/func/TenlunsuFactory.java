package com.gupaedu.vip.pattern.factory.func;

import com.gupaedu.vip.pattern.factory.Milk;
import com.gupaedu.vip.pattern.factory.Tenlunsu;

/**
 *
 * 事情变的越来越专业
 * @author code
 */
public class TenlunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Tenlunsu();
    }
}
