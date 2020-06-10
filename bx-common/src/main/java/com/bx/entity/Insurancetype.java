package com.kgc.entity;

import java.io.Serializable;

/**
 * (Insurancetype)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Insurancetype implements Serializable {
    private static final long serialVersionUID = -52066039094740017L;
    /**
    * 保险类型编号
    */
    private Integer id;
    /**
    * 保险类型名称
    */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}