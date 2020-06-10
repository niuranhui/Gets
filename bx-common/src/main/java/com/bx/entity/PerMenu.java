package com.bx.entity;

import java.io.Serializable;

/**
 * (PerMenu)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class PerMenu implements Serializable {
    private static final long serialVersionUID = -56507636779189605L;
    
    private Integer id;
    /**
    * 权限ID
    */
    private Integer pid;
    /**
    * 菜单id
    */
    private Integer mid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

}