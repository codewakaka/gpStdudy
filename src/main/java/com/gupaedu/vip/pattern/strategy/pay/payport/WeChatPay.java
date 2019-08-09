package com.gupaedu.vip.pattern.strategy.pay.payport;

import com.gupaedu.vip.pattern.strategy.pay.PayState;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 21:11
 */
public class WeChatPay implements  Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查询红包余额，开始扣除");
        return new PayState(200,"支付成功",amount);
    }
}
