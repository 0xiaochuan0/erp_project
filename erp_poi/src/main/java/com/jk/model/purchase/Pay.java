package com.jk.model.purchase;

import java.io.Serializable;
import java.util.Objects;

public class Pay  implements Serializable {

    private static final long serialVersionUID = -8237685286703940604L;
    private  Integer    payId;
    private  String    payWay;
    private  String    laterPay;
    private  String    startTime;
    private  String    countTime;
    private  String    countPayTime;
    private  Integer   userId;
    private  String    supplierNumberPay;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getLaterPay() {
        return laterPay;
    }

    public void setLaterPay(String laterPay) {
        this.laterPay = laterPay;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCountTime() {
        return countTime;
    }

    public void setCountTime(String countTime) {
        this.countTime = countTime;
    }

    public String getCountPayTime() {
        return countPayTime;
    }

    public void setCountPayTime(String countPayTime) {
        this.countPayTime = countPayTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSupplierNumberPay() {
        return supplierNumberPay;
    }

    public void setSupplierNumberPay(String supplierNumberPay) {
        this.supplierNumberPay = supplierNumberPay;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "payId=" + payId +
                ", payWay='" + payWay + '\'' +
                ", laterPay='" + laterPay + '\'' +
                ", startTime='" + startTime + '\'' +
                ", countTime='" + countTime + '\'' +
                ", countPayTime='" + countPayTime + '\'' +
                ", userId=" + userId +
                ", supplierNumberPay='" + supplierNumberPay + '\'' +
                '}';
    }

    public Pay(Integer payId, String payWay, String laterPay, String startTime, String countTime, String countPayTime, Integer userId, String supplierNumberPay) {
        this.payId = payId;
        this.payWay = payWay;
        this.laterPay = laterPay;
        this.startTime = startTime;
        this.countTime = countTime;
        this.countPayTime = countPayTime;
        this.userId = userId;
        this.supplierNumberPay = supplierNumberPay;
    }

    public Pay() {
    }
}
