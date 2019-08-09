package com.gupaedu.vip.pattern.strategy.pay.payport;

import com.gupaedu.vip.pattern.strategy.pay.PayState;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 21:03
 */
public interface Payment {
    //每次增加一次渠道就要维护接口一次
    public  final static  Payment ALi_PAY = new Alipay();
    public  final static  Payment WECHAT_PAY = new WeChatPay();
    public  final static  Payment UNion_PAY = new UnionPay();

    public PayState pay(String uid , double amount);
}
