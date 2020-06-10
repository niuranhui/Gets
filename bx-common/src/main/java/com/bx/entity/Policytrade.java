package com.bx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Policytrade)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Policytrade implements Serializable {
    private static final long serialVersionUID = 726026909461153941L;
    
    private String tradeid;
    /**
    * 保单编号
    */
    private String policyid;
    /**
    * 保单缴费金额
    */
    private Object paymoney;
    /**
    * 保单缴费日期
    */
    private Date paytime;
    /**
    * 保单扣费银行卡编号
    */
    private String bankid;


    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public Object getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Object paymoney) {
        this.paymoney = paymoney;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

}