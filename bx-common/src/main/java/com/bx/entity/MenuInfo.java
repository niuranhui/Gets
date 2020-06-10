package com.bx.entity;

import java.io.Serializable;

/**
 * (MenuInfo)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class MenuInfo implements Serializable {
    private static final long serialVersionUID = 141865188206419288L;
    
    private Integer id;
    /**
    * 菜单名称
    */
    private String menuname;
    /**
    * 菜单级别：1：一级；2：二级
    */
    private Integer level;
    /**
    * 父菜单编号：0：没有父菜单；
    */
    private Integer parentid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

}