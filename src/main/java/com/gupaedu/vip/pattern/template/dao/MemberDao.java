package com.gupaedu.vip.pattern.template.dao;

import com.gupaedu.vip.pattern.template.JdbcTemplate;
import com.gupaedu.vip.pattern.template.RowMapper;
import com.gupaedu.vip.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 22:04
 */
public class MemberDao {
    //不继承是为了解耦
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query() {
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setAge(rs.getInt("age"));
                member.setPassword(rs.getString("password"));
                return member;
            }
        }, null);
    }

   /* public List<?> processResult(ResultSet rs,int rowNum) throws SQLException {
        List<Member> list = new ArrayList();
        for (int i = 0; i <rowNum ; i++) {
            Member member = new Member();
            member.setUsername(rs.getString("username"));
            member.setAge(rs.getInt("age"));
            member.setPassword(rs.getString("password"));
            list.add(member);
        }
        return list;
    }*/
}
