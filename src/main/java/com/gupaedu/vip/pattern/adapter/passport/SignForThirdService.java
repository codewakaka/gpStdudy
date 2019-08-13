package com.gupaedu.vip.pattern.adapter.passport;

import com.gupaedu.vip.pattern.adapter.ResultMsg;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/12 20:26
 */
public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId){
        //1.认为openId是全局唯一，我们可以把它当做用户名
        //2.密码默认为EMPTY 或者为null
        //3.注册（在原有系统中创建一个用户
        ResultMsg resultMsg = super.regist(openId, null);
        // 4.调用原来登陆方法
        resultMsg = super.login(openId,null);
        return resultMsg;
    }
    public ResultMsg loginForWeixin(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到信息，再重新登陆

        return null;
    }
    public ResultMsg loginForTelPhone(String telPhone,String code){
        return null;
    }
    public ResultMsg loginRegist(){
        return null;
    }
}
