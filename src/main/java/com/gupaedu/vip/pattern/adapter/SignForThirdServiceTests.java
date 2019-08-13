package com.gupaedu.vip.pattern.adapter;

import com.gupaedu.vip.pattern.adapter.passport.SignForThirdService;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/12 20:30
 */
public class SignForThirdServiceTests {
    public static void main(String[] args) {
        SignForThirdService signForThirdService = new SignForThirdService();
        //加策略模式
        //不改变原来代码也要兼容原来，适配器模式
        signForThirdService.loginForQQ("342 rfsdfsddfsdfsd");
    }

}
