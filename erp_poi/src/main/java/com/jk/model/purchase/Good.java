package com.jk.model.purchase;

import java.io.Serializable;

public class Good implements Serializable {


    private static final long serialVersionUID = 5606144135201566357L;

    private  Integer  goodId;
    private  String   goodNum;
    private  String   goodName;
    private  String   goodSize;
    private  String  goodUnit;
    private Integer userId;
    private  String  supplierNumber;

    private  Double  unitPrice;

    private  String   qinggoushu ;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(String goodNum) {
        this.goodNum = goodNum;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodSize() {
        return goodSize;
    }

    public void setGoodSize(String goodSize) {
        this.goodSize = goodSize;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQinggoushu() {
        return qinggoushu;
    }

    public void setQinggoushu(String qinggoushu) {
        this.qinggoushu = qinggoushu;
    }

    public Good(Integer goodId, String goodNum, String goodName, String goodSize, String goodUnit, Integer userId, String supplierNumber, Double unitPrice, String qinggoushu) {
        this.goodId = goodId;
        this.goodNum = goodNum;
        this.goodName = goodName;
        this.goodSize = goodSize;
        this.goodUnit = goodUnit;
        this.userId = userId;
        this.supplierNumber = supplierNumber;
        this.unitPrice = unitPrice;
        this.qinggoushu = qinggoushu;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", goodNum='" + goodNum + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodSize='" + goodSize + '\'' +
                ", goodUnit='" + goodUnit + '\'' +
                ", userId=" + userId +
                ", supplierNumber='" + supplierNumber + '\'' +
                ", unitPrice=" + unitPrice +
                ", qinggoushu='" + qinggoushu + '\'' +
                '}';
    }

    public Good() {
    }
}
