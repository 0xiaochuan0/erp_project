package com.jk.model.purchase;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Cai implements Serializable {
    private static final long serialVersionUID = -5430942187685028077L;
    private Integer orderId;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creatDate;

    private String orderNum;

    private Integer orderStatus;

    private String gongYingShangNum;

    private String gongYingShangName;

    private String qingGouFuZe;

    private String caiGouChuLi;

    private String caiGouShengHe;

    private String duiYingQingGouNum;

    private Integer shui;

    private String shuiLv;

    private String adress;

    private String editperson;

    private Integer dept;

    private Integer userId;

    private  String  beizhu;

    private  Integer  caigoushu;

    private  String   shangnum;



    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getGongYingShangNum() {
        return gongYingShangNum;
    }

    public void setGongYingShangNum(String gongYingShangNum) {
        this.gongYingShangNum = gongYingShangNum == null ? null : gongYingShangNum.trim();
    }

    public String getGongYingShangName() {
        return gongYingShangName;
    }

    public void setGongYingShangName(String gongYingShangName) {
        this.gongYingShangName = gongYingShangName == null ? null : gongYingShangName.trim();
    }

    public String getQingGouFuZe() {
        return qingGouFuZe;
    }

    public void setQingGouFuZe(String qingGouFuZe) {
        this.qingGouFuZe = qingGouFuZe == null ? null : qingGouFuZe.trim();
    }

    public String getCaiGouChuLi() {
        return caiGouChuLi;
    }

    public void setCaiGouChuLi(String caiGouChuLi) {
        this.caiGouChuLi = caiGouChuLi == null ? null : caiGouChuLi.trim();
    }

    public String getCaiGouShengHe() {
        return caiGouShengHe;
    }

    public void setCaiGouShengHe(String caiGouShengHe) {
        this.caiGouShengHe = caiGouShengHe == null ? null : caiGouShengHe.trim();
    }

    public String getDuiYingQingGouNum() {
        return duiYingQingGouNum;
    }

    public void setDuiYingQingGouNum(String duiYingQingGouNum) {
        this.duiYingQingGouNum = duiYingQingGouNum == null ? null : duiYingQingGouNum.trim();
    }

    public Integer getShui() {
        return shui;
    }

    public void setShui(Integer shui) {
        this.shui = shui;
    }

    public String getShuiLv() {
        return shuiLv;
    }

    public void setShuiLv(String shuiLv) {
        this.shuiLv = shuiLv == null ? null : shuiLv.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getEditperson() {
        return editperson;
    }

    public void setEditperson(String editperson) {
        this.editperson = editperson == null ? null : editperson.trim();
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Integer getCaigoushu() {
        return caigoushu;
    }

    public void setCaigoushu(Integer caigoushu) {
        this.caigoushu = caigoushu;
    }

    public String getShangnum() {
        return shangnum;
    }

    public void setShangnum(String shangnum) {
        this.shangnum = shangnum;
    }



}