package com.bx.entity;

import java.io.Serializable;

/**
 * (PageageInsurproduct)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class PageageInsurproduct implements Serializable {
    private static final long serialVersionUID = -73134476185745205L;
    
    private Integer id;
    
    private Integer proid;
    
    private Integer packageid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getPackageid() {
        return packageid;
    }

    public void setPackageid(Integer packageid) {
        this.packageid = packageid;
    }

}