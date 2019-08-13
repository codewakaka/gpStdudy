package com.gupaedu.vip.pattern.decorator.passport.old;

import com.gupaedu.vip.pattern.adapter.Member;
import com.gupaedu.vip.pattern.adapter.ResultMsg;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/13 20:59
 */
public class SignService implements ISignService {

    /**
     * create by: xgh
     * description: TODO
     * create time: 2019/8/12 20:24
     *
     * @Param: username;
     * @Param: password;
     * @return
     */
    @Override
    public ResultMsg regist(String username, String password){
        return new ResultMsg("200","注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password){
        return null;
    }
}
