package com.jk.model.dept;

import java.io.Serializable;

public class DeptBean implements Serializable {

    private static final long serialVersionUID = -2439786380039883270L;

    private Integer id;

    private String name;

    private Integer userId;

    private Integer pid;

    /**
     * 负责人   业务使用
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}