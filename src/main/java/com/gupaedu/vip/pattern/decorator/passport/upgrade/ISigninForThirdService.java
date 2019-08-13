package com.gupaedu.vip.pattern.decorator.passport.upgrade;

import com.gupaedu.vip.pattern.adapter.ResultMsg;
import com.gupaedu.vip.pattern.decorator.passport.old.ISignService;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 20:38
 */
public interface ISigninForThirdService extends ISignService   {
    public ResultMsg loginForQQ(String openId);
    public ResultMsg loginForWeixin(String openId);

    public ResultMsg loginForToken(String token);
    public ResultMsg loginForTelPhone(String telPhone,String code);
    public ResultMsg loginRegist();
}
