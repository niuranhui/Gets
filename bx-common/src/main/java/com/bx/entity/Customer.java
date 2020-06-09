package com.bx.entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {

     private String cid;
     private String uid;
     private Date createTime;
     private Date  updateTime;
     private String createorId;
     private Integer source;
     private Integer stateus;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
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
