package com.jk.model.role;

import com.jk.model.Page;

import java.io.Serializable;

public class RoleBean extends Page implements Serializable {

    private static final long serialVersionUID = 1070348587487092586L;

    private Integer id;

    private String name;

    private String text;

    private String powerName;

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
}