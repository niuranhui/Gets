package com.bx.entity;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:54
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 390885728984780919L;
    
    private Integer id;
    /**
    * 角色id
    */
    private Integer roleid;
    /**
    * 员工Id
    */
    private String userid;
    /**
    * 分区Id，指定员工所属的分区编号
    */
    private Integer areaid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

}