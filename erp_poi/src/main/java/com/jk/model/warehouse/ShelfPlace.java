package com.jk.model.warehouse;

import java.io.Serializable;



public class ShelfPlace implements Serializable{
    private static final long serialVersionUID = -8504985663933820428L;
    private Integer placeId;

    private String placeName;

    private Integer placeNumber;

    private Integer placeUse;

    private Integer surplusNumber;

    private Integer commodityId;

    private String commodityName;

    private Integer pid;

    private String regionName;

    private String shelfName;

    private String areaName;

    private String regionPlace;

    public String getRegionPlace() {
        return regionPlace;
    }

    public void setRegionPlace(String regionPlace) {
        this.regionPlace = regionPlace;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    public Integer getPlaceUse() {
        return placeUse;
    }

    public void setPlaceUse(Integer placeUse) {
        this.placeUse = placeUse;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getSurplusNumber() {
        return surplusNumber;
    }

    public void setSurplusNumber(Integer surplusNumber) {
        this.surplusNumber = surplusNumber;
    }

    @Override
    public String toString() {
        return "ShelfPlace{" +
                "placeId=" + placeId +
                ", placeName='" + placeName + '\'' +
                ", placeNumber=" + placeNumber +
                ", placeUse=" + placeUse +
                ", surplusNumber=" + surplusNumber +
                ", commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", pid=" + pid +
                ", regionName='" + regionName + '\'' +
                ", shelfName='" + shelfName + '\'' +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}