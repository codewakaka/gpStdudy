package com.gupaedu.vip.pattern.template.entity;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/9 22:03
 */
public class Member {
    private String username;
    private String password;

    private String nickName;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
