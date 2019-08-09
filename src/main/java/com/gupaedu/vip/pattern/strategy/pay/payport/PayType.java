package com.gupaedu.vip.pattern.strategy.pay.payport;


public enum PayType {
    ALIPAY(new Alipay()),
    WECHAT_PAY(new WeChatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get() {
        return this.payment;
    }

}
