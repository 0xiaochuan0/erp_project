package com.jk.model.power;

import com.jk.model.Page;

import java.io.Serializable;

public class PowerBean extends Page implements Serializable {

    private static final long serialVersionUID = -8075143509468337175L;

    private Integer id;

    private String name;

    private Integer pid;

    private String power;

    private Integer grade;

    /**
     * 权限组名称  业务使用
     */
    private String treeName;

    /**
     * 业务使用
     */
    private Integer roleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    @Override
    public String toString() {
        return "PowerBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", power='" + power + '\'' +
                ", grade=" + grade +
                ", treeName='" + treeName + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}