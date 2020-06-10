package com.bx.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * (StaffPermission)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:54
 */
public class StaffPermission implements Serializable {
    private static final long serialVersionUID = -90820508023112026L;
    /**
    * 权限ID
    */
    private Integer id;
    /**
    * 权限名称
    */
    private String pname;
    /**
    * 权限描述
    */
    private String description;
    
    private Date createtime;
    
    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}