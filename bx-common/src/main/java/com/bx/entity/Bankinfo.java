package com.bx.entity;

import java.io.Serializable;

/**
 * (Bankinfo)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Bankinfo implements Serializable {
    private static final long serialVersionUID = -83419422106183221L;
    /**
    * 银行卡编号
    */
    private String bid;
    /**
    * 银行卡卡号
    */
    private String cardno;
    /**
    * 套餐编号
    */
    private String phone;
    /**
    * 客户编号
    */
    private String cid;
    /**
    * 银行卡开户银行
    */
    private String bankbrand;


    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBankbrand() {
        return bankbrand;
    }

    public void setBankbrand(String bankbrand) {
        this.bankbrand = bankbrand;
    }

}