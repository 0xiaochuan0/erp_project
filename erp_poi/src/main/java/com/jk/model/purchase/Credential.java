package com.jk.model.purchase;

import java.io.Serializable;

public class Credential implements Serializable {
    private static final long serialVersionUID = -2912239390481947763L;

    private  Integer  credId;

    private  String    yingYe;

    private   String   zheng1;

    private   String   zheng2;
    private   String   zheng3;

    private  String  supplierNumberZheng;

    private  Integer  userId;

    public Integer getCredId() {
        return credId;
    }

    public void setCredId(Integer credId) {
        this.credId = credId;
    }

    public String getYingYe() {
        return yingYe;
    }

    public void setYingYe(String yingYe) {
        this.yingYe = yingYe;
    }

    public String getZheng1() {
        return zheng1;
    }

    public void setZheng1(String zheng1) {
        this.zheng1 = zheng1;
    }

    public String getZheng2() {
        return zheng2;
    }

    public void setZheng2(String zheng2) {
        this.zheng2 = zheng2;
    }

    public String getZheng3() {
        return zheng3;
    }

    public void setZheng3(String zheng3) {
        this.zheng3 = zheng3;
    }

    public String getSupplierNumberZheng() {
        return supplierNumberZheng;
    }

    public void setSupplierNumberZheng(String supplierNumberZheng) {
        this.supplierNumberZheng = supplierNumberZheng;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Credential() {
    }

    public Credential(Integer credId, String yingYe, String zheng1, String zheng2, String zheng3, String supplierNumberZheng, Integer userId) {
        this.credId = credId;
        this.yingYe = yingYe;
        this.zheng1 = zheng1;
        this.zheng2 = zheng2;
        this.zheng3 = zheng3;
        this.supplierNumberZheng = supplierNumberZheng;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Credential{" +
                "credId=" + credId +
                ", yingYe='" + yingYe + '\'' +
                ", zheng1='" + zheng1 + '\'' +
                ", zheng2='" + zheng2 + '\'' +
                ", zheng3='" + zheng3 + '\'' +
                ", supplierNumberZheng='" + supplierNumberZheng + '\'' +
                ", userId=" + userId +
                '}';
    }
}
