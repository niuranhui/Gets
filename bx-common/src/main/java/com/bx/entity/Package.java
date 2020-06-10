package com.bx.entity;

import java.io.Serializable;

/**
 * (Package)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Package implements Serializable {
    private static final long serialVersionUID = -38897887577198904L;
    
    private Integer id;
    /**
    * 套餐名称	
    */
    private String packagename;
    /**
    * 套餐所属分区id
    */
    private Integer orgid;
    /**
    * 套餐的创建人
    */
    private String createid;
    /**
    * 状态：0：在线状态；1：下线状态；默认：0
    */
    private Integer status;
    
    private Object createtime;
    
    private Object updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

}