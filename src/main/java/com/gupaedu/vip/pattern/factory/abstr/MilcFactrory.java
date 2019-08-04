package com.gupaedu.vip.pattern.factory.abstr;

import com.gupaedu.vip.pattern.factory.Mengniu;
import com.gupaedu.vip.pattern.factory.Milk;
import com.gupaedu.vip.pattern.factory.func.MengniuFactory;
import com.gupaedu.vip.pattern.factory.func.SanluFactory;
import com.gupaedu.vip.pattern.factory.func.TenlunsuFactory;
import com.gupaedu.vip.pattern.factory.func.YiliFactory;

/**
 *
 * @author code
 * */
public class MilcFactrory implements AbstractFactory {
    @Override
    public Milk getMenniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    public Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    public Milk getTenlunsu() {
        return new TenlunsuFactory().getMilk();
    }

    @Override
    public Milk getSanlu() {
        return new SanluFactory().getMilk();
    }
}
