package com.bx.entity;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -63826187038659778L;
    
    private Integer id;
    /**
    * 角色id
    */
    private Integer roleid;
    /**
    * 权限id
    */
    private Integer pid;


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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}