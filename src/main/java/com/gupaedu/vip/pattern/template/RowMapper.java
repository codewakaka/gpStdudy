package com.gupaedu.vip.pattern.template;

import java.sql.ResultSet;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 22:25
 */
public interface RowMapper<T> {
    public T mapRow(ResultSet rs,int rowNum)throws Exception;
}
