package com.itcorey.domain;

import java.io.Serializable;

/**
 * Created by ：Corey
 * 20:54 2018/11/5
 * 用户实体类
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6849931978500195373L;
    private Integer id;
    private String userName;
    private Integer password;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", age=" + age +
                '}';
    }
}

