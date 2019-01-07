package com.jk.model.good;

import com.jk.model.Page;

import java.io.Serializable;

public class GoodBean extends Page implements Serializable {

    private static final long serialVersionUID = -2571908448269112283L;

    private Integer id;

    private String goodName;

    private String goodNum;

    private String goodSize;

    private String goodUnit;

    private String goodSupplierNumber;

    private Integer userId;

    /**
     * 业务使用  单价
     */
    private Double unitPrice;

    /**
     * 业务使用  数量
     */
    private Integer numbers;

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(String goodNum) {
        this.goodNum = goodNum == null ? null : goodNum.trim();
    }

    public String getGoodSize() {
        return goodSize;
    }

    public void setGoodSize(String goodSize) {
        this.goodSize = goodSize == null ? null : goodSize.trim();
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit == null ? null : goodUnit.trim();
    }

    public String getGoodSupplierNumber() {
        return goodSupplierNumber;
    }

    public void setGoodSupplierNumber(String goodSupplierNumber) {
        this.goodSupplierNumber = goodSupplierNumber == null ? null : goodSupplierNumber.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}