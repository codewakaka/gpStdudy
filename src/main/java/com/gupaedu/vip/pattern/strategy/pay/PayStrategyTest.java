package com.gupaedu.vip.pattern.strategy.pay;

import com.gupaedu.vip.pattern.strategy.pay.Order;
import com.gupaedu.vip.pattern.strategy.pay.payport.PayType;
import com.gupaedu.vip.pattern.strategy.pay.payport.Payment;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 21:08
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        //省略把商品添加到购物车，从购物车下单
        //直接从定单开始
        Order order = new Order("1","2019010101101010",200);
        //开始支付 微信 支付宝 银联 京东
        //每个渠道支付具体算法不一样
        //基本算法固定的
       // System.out.println(order.pay(new Alipay()));;
     //   System.out.println(order.pay(Payment.WECHAT_PAY));;
        System.out.println(order.pay(PayType.UNION_PAY));

        new ArrayList<Object>().sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
