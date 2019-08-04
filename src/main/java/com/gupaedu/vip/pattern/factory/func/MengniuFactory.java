package com.gupaedu.vip.pattern.factory.func;

import com.gupaedu.vip.pattern.factory.Mengniu;
import com.gupaedu.vip.pattern.factory.Milk;

/**
 * @author code
 */
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
