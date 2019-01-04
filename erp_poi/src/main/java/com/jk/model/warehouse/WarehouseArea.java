package com.jk.model.warehouse;

import java.io.Serializable;

public class WarehouseArea implements Serializable {
    private static final long serialVersionUID = -5128106465389289834L;
    private Integer areaId;

    private String areaName;

    private Integer pid;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}