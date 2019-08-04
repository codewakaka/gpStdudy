package com.gupaedu.vip.pattern.factory.abstr;

import com.gupaedu.vip.pattern.factory.Milk;

/**
 * 抽象工厂用户主入口
 * 便于拓展
 * 统一管理
 * @author code
 */
public interface AbstractFactory {
    /**
     * 获得蒙牛工厂
     *
     * @return Milk;
     */
    public abstract Milk getMenniu();

    /**
     * 获得蒙牛工厂
     *
     * @return Milk;
     */
    public abstract Milk getYili();

    /**
     * 获得蒙牛工厂
     *
     * @return Milk;
     */
    public abstract Milk getTenlunsu();

    public abstract Milk getSanlu();
}
