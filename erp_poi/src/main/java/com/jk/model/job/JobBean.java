package com.jk.model.job;

import java.io.Serializable;

public class JobBean implements Serializable {

    private static final long serialVersionUID = 5777884256707541945L;

    private Integer id;

    private String name;

    private Integer pid;

    private Integer deptId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}