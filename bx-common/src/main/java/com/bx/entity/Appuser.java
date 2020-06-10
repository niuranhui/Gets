package com.bx.entity;

import java.io.Serializable;

/**
 * (Appuser)实体类
 *
 * @author makejava
 * @since 2020-06-04 23:36:53
 */
public class Appuser implements Serializable {
    private static final long serialVersionUID = -19272012844188502L;
    
    private String uid;
    /**
    * 客户ID
    */
    private String cid;
    /**
    * 登录账户
    */
    private String loginname;
    /**
    * 登录密码
    */
    private String password;
    /**
    * 头像路径
    */
    private String imgurl;
    
    private Object createtime;
    
    private Object updatetime;
    /**
    * 状态：0：在线 1：离线 
    */
    private Integer status;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}