package com.jk.model.role;

import java.io.Serializable;

public class RoleBean implements Serializable {

    private static final long serialVersionUID = 1070348587487092586L;

    private Integer id;

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
        this.name = name == null ? null : name.trim();
    }
}