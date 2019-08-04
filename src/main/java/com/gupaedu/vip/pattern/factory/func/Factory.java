package com.gupaedu.vip.pattern.factory.func;

import com.gupaedu.vip.pattern.factory.Milk;

/**
 * 工厂模型
 *
 * @author cmy
 */
public interface Factory {
    /**
     *
     * 工厂必然具有生成产品技能，统一产品出口
     * @return Milk;
     */
    Milk getMilk();
}
