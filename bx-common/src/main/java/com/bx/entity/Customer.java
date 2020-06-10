package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Customer)客户实体类
 *
 * @author makejava
 * @since 2020-06-05 19:54:34
 */
public class Customer implements Serializable {
    /**
    * 编号
    */
    private String cid;
    /**
     * 用户编号
     */
    private String uid;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 创建客户的创建者的id
    */
    private String createorId;
    /**
    * 0:员工创建；1：APP User创建；默认0
    */
    private Integer source;
    /**
     * 状态
     * 0:在线；1：在线
     */
    private Integer stateus;

    private Customerinfo customerinfo;

    public Customerinfo getCustomerinfo() {
        return customerinfo;
    }

    public void setCustomerinfo(Customerinfo customerinfo) {
        this.customerinfo = customerinfo;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getCreateorId() {
        return createorId;
    }

    public void setCreateorId(String createorId) {
        this.createorId = createorId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStateus() {
        return stateus;
    }

    public void setStateus(Integer stateus) {
        this.stateus = stateus;
    }
}