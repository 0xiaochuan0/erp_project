package com.jk.model.warehouse;

import java.io.Serializable;
import java.util.Date;
/*
* 出库实体类
* */
public class WarehouseDelivery implements Serializable {
    private static final long serialVersionUID = 4995276348530322306L;
    private Integer id;//id

    private Integer type;//配送方式

    private String returnDate;//配送时间

    private String salesReturnId;//订单编号

    private String salesBodyName;//订单收货人

    private String salesBodyPhone;//订单收货人联系电话

    private String salesSite;//收货地址

    private Integer warehouseId;//仓库编号

    private String warehouseName;//仓库名称

    private String warehouseUserName;//仓管员名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getSalesReturnId() {
        return salesReturnId;
    }

    public void setSalesReturnId(String salesReturnId) {
        this.salesReturnId = salesReturnId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseUserName() {
        return warehouseUserName;
    }

    public void setWarehouseUserName(String warehouseUserName) {
        this.warehouseUserName = warehouseUserName;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSalesBodyName() {
        return salesBodyName;
    }

    public void setSalesBodyName(String salesBodyName) {
        this.salesBodyName = salesBodyName;
    }

    public String getSalesBodyPhone() {
        return salesBodyPhone;
    }

    public void setSalesBodyPhone(String salesBodyPhone) {
        this.salesBodyPhone = salesBodyPhone;
    }

    public String getSalesSite() {
        return salesSite;
    }

    public void setSalesSite(String salesSite) {
        this.salesSite = salesSite;
    }
}