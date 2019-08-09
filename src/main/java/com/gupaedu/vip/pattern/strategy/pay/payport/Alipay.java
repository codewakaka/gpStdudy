package com.gupaedu.vip.pattern.strategy.pay.payport;

import com.gupaedu.vip.pattern.strategy.pay.PayState;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 21:11
 */
public class Alipay implements  Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账号余额，开始支付");
        return new PayState(200,"支付成功",amount);
    }
}
