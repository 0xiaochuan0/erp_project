package com.jk.model.warehouse;

import java.io.Serializable;
/*
* 入库实体类
* */
public class WarehouseManage implements Serializable {
    private static final long serialVersionUID = 2112842346009578426L;
    private Integer id;//id

    private Integer state;//属性 1.未入库 2.已入库

    private Integer type;//类型 1.一般入库 2.调拨入库

    private String inboundDate;//入库时间

    private String indentId;//采购单编号

    private String indentMerchantName;//供应商编号

    private String indentUserName;//收货人

    private Integer warehouseId;//仓库编号

    private String warehouseName;//仓库名称

    private String warehouseUserName;//仓库管理员名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(String inboundDate) {
        this.inboundDate = inboundDate;
    }

    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
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

    public String getIndentMerchantName() {
        return indentMerchantName;
    }

    public void setIndentMerchantName(String indentMerchantName) {
        this.indentMerchantName = indentMerchantName;
    }

    public String getIndentUserName() {
        return indentUserName;
    }

    public void setIndentUserName(String indentUserName) {
        this.indentUserName = indentUserName;
    }
}