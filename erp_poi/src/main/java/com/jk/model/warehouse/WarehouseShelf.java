package com.jk.model.warehouse;

import java.io.Serializable;

public class WarehouseShelf implements Serializable {
    private static final long serialVersionUID = 7851294246827852142L;
    private Integer shelfId;

    private String shelfName;

    private Integer pid;

    public Integer getShelfId() {
        return shelfId;
    }

    public void setShelfId(Integer shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName == null ? null : shelfName.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}