package com.bx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Reviewrecord)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Reviewrecord implements Serializable {
    private static final long serialVersionUID = 373275499465091061L;
    
    private String id;
    /**
    * 保单编号
    */
    private String varchar;
    /**
    * 保单状态
    */
    private Integer statu;
    /**
    * 保单审核人编号
    */
    private String reviewid;
    /**
    * 保单审核日期
    */
    private Date reviewtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getReviewid() {
        return reviewid;
    }

    public void setReviewid(String reviewid) {
        this.reviewid = reviewid;
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

}