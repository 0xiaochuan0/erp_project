package com.jk.model.purchase;

import java.io.Serializable;
import java.util.Objects;

public class Pay  implements Serializable {

    private static final long serialVersionUID = -8237685286703940604L;
    private  Integer    id;
    private  String    payWay;
    private  String    laterPay;
    private  String    startTime;
    private  String    countTime;
    private  String    countPayTime;
    private  Integer   userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Pay() {
    }

    public Pay(Integer id, String payWay, String laterPay, String startTime, String countTime, String countPayTime, Integer userId) {
        this.id = id;
        this.payWay = payWay;
        this.laterPay = laterPay;
        this.startTime = startTime;
        this.countTime = countTime;
        this.countPayTime = countPayTime;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "id=" + id +
                ", payWay='" + payWay + '\'' +
                ", laterPay='" + laterPay + '\'' +
                ", startTime='" + startTime + '\'' +
                ", countTime='" + countTime + '\'' +
                ", countPayTime='" + countPayTime + '\'' +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pay pay = (Pay) o;
        return id.equals(pay.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
