package com.gupaedu.vip.pattern.adapter.passport;

import com.gupaedu.vip.pattern.adapter.Member;
import com.gupaedu.vip.pattern.adapter.ResultMsg;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/12 20:20
 */
public class SignService {

    /**
     * create by: xgh
     * description: TODO
     * create time: 2019/8/12 20:24
     *
      * @Param: username;
     * @Param: password;
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg("200","注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
