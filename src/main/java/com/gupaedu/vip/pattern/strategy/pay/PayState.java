package com.gupaedu.vip.pattern.strategy.pay;

/**
 * @author ：xgh
 * @description：支付完成后状态
 * @date ：Created in 2019/8/9 21:04
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code,  String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String  toString(){
    return ("支付状态：["+code +"],"+msg +"交易详情："+data);
    }
}
