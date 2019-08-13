package com.gupaedu.vip.pattern.decorator.passport.old;

import com.gupaedu.vip.pattern.adapter.Member;
import com.gupaedu.vip.pattern.adapter.ResultMsg;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/12 20:20
 */
public interface ISignService {

    /**
     * create by: xgh
     * description: TODO
     * create time: 2019/8/12 20:24
     *
      * @Param: username;
     * @Param: password;
     * @return
     */
    public ResultMsg regist(String username,String password);

    public ResultMsg login(String username,String password);
}
