package com.itcorey.domain;

import java.io.Serializable;

/**
 * 多用户用户实体类
 */
public class MorUser implements Serializable{

    private static final long serialVersionUID = -1368528152504988863L;

    private Long id;

    private String userName;

    private String phone;

    private String idNo;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "MorUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}