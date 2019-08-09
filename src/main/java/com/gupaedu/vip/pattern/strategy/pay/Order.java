package com.gupaedu.vip.pattern.strategy.pay;

import com.gupaedu.vip.pattern.strategy.pay.payport.PayType;
import com.gupaedu.vip.pattern.strategy.pay.payport.Payment;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 21:01
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /*public PayState pay(Payment payment){
        return payment.pay(this.uid,this.amount);
    }*/
    //不选择payment接口原因
    //完美解决了 switch过程 ，不需要if else if
    public PayState pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }
}
