package com.jk.model.warehouse;

import java.io.Serializable;

public class WarehouseRegion implements Serializable {
    private static final long serialVersionUID = 5318493119764598940L;
    private Integer regionId;//id

    private String regionName;//仓库名称

    private String regionPlace;//仓库地址

    private Integer userId;//仓管员id

    private String userName;//仓管员名称

    private Integer areaSum;//仓库总数

    private Integer shelfSum;//货架总数

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getRegionPlace() {
        return regionPlace;
    }

    public void setRegionPlace(String regionPlace) {
        this.regionPlace = regionPlace == null ? null : regionPlace.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAreaSum() {
        return areaSum;
    }

    public void setAreaSum(Integer areaSum) {
        this.areaSum = areaSum;
    }

    public Integer getShelfSum() {
        return shelfSum;
    }

    public void setShelfSum(Integer shelfSum) {
        this.shelfSum = shelfSum;
    }
}