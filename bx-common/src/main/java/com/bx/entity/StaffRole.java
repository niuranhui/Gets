package com.bx.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * (StaffRole)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:54
 */
public class StaffRole implements Serializable {
    private static final long serialVersionUID = -73907640525974617L;
    
    private Integer id;
    /**
    * 角色名称
    */
    private String rname;
    /**
    * 角色描述
    */
    private String description;
    
    private Date createtime;
    
    private Date updatetime;

    private List<StaffPermission> permissions;

    public List<StaffPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<StaffPermission> permissions) {
        this.permissions = permissions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
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