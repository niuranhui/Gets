package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Customerinfo)实体类
 *
 * @author makejava
 * @since 2020-06-09 11:19:00
 */
public class Customerinfo implements Serializable {
    private static final long serialVersionUID = -32505067469656961L;
    /**
    * 编号
    */
    private String id;
    /**
    * 用户编号
    */
    private String userId;
    /**
    * 姓名
    */
    private String userName;
    /**
    * 出生日期
    */
    private Date birthday;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 地址
    */
    private String address;
    /**
    * 性别
    */
    private Integer sex;
    /**
    * 电子邮箱
    */
    private String Email;
    /**
    * 身份证号
    */
    private String IdentityCard;
    
    private Date createTime;
    
    private Date updateTime;
    /**
    * 1：APP端用户；2：员工；3：客户
    */
    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getIdentityCard() {
        return IdentityCard;
    }

    public void setIdentityCard(String identityCard) {
        IdentityCard = identityCard;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}