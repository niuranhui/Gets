package com.bx.entity;

import java.io.Serializable;

/**
 * (Insurproduct)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Insurproduct implements Serializable {
    private static final long serialVersionUID = -14560254087005094L;
    
    private Integer id;
    /**
    * 险种代码编号
    */
    private String productcode;
    /**
    * 险种名称
    */
    private String productname;
    /**
    * 保险状态：0：上架；1：下架
    */
    private Integer productstatus;
    /**
    * 保险类型
    */
    private Integer typeid;
    /**
    * 保险适合最小年龄
    */
    private Integer minage;
    /**
    * 保险适合最大年龄
    */
    private Integer maxage;
    /**
    * 缴费方式：0：趸缴（一次性付清）；1：年缴（按年缴）
    */
    private Integer paymentway;
    /**
    * 缴费期限（10年，20年，30年，0年：无期限限制，一年一缴，缴完本年报本年）
    */
    private Integer paymentdate;
    /**
    * 创建者
    */
    private String createid;
    /**
    * 保险期限（60,70,80,999：保终身）
    */
    private String productexpiretime;
    /**
    * 保险特色 
    */
    private String productdescription;
    /**
    * 最低保障金
    */
    private Object minreturnmoney;
    /**
    * 最高保障金
    */
    private Object maxreturnmoney;
    
    private Object createtime;
    
    private Object updatetime;
    /**
    * 保障说明文档
    */
    private Object ensureinfo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    public Integer getPaymentway() {
        return paymentway;
    }

    public void setPaymentway(Integer paymentway) {
        this.paymentway = paymentway;
    }

    public Integer getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Integer paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid;
    }

    public String getProductexpiretime() {
        return productexpiretime;
    }

    public void setProductexpiretime(String productexpiretime) {
        this.productexpiretime = productexpiretime;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public Object getMinreturnmoney() {
        return minreturnmoney;
    }

    public void setMinreturnmoney(Object minreturnmoney) {
        this.minreturnmoney = minreturnmoney;
    }

    public Object getMaxreturnmoney() {
        return maxreturnmoney;
    }

    public void setMaxreturnmoney(Object maxreturnmoney) {
        this.maxreturnmoney = maxreturnmoney;
    }

    public Object getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Object createtime) {
        this.createtime = createtime;
    }

    public Object getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Object updatetime) {
        this.updatetime = updatetime;
    }

    public Object getEnsureinfo() {
        return ensureinfo;
    }

    public void setEnsureinfo(Object ensureinfo) {
        this.ensureinfo = ensureinfo;
    }

}