package com.jk.model.indents;

import java.io.Serializable;

public class Indents implements Serializable{

    private static final long serialVersionUID = 2163065103661819369L;

    private Integer id;

    private String creatTime;

    private String startDate;
    private String endDate;
    private String consumer;


    private Integer money;

    private Integer payId;

    private Integer fromId;

    private Integer payStatus;

    private String goods;
    private String consignee;
    private String confirm_time;
    private String receiving_time;
    private String dispose_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer == null ? null : consumer.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(String confirm_time) {
        this.confirm_time = confirm_time;
    }

    public String getReceiving_time() {
        return receiving_time;
    }

    public void setReceiving_time(String receiving_time) {
        this.receiving_time = receiving_time;
    }

    public String getDispose_time() {
        return dispose_time;
    }

    public void setDispose_time(String dispose_time) {
        this.dispose_time = dispose_time;
    }

    @Override
    public String toString() {
        return "Indents{" +
                "id=" + id +
                ", creatTime='" + creatTime + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", consumer='" + consumer + '\'' +
                ", money=" + money +
                ", payId=" + payId +
                ", fromId=" + fromId +
                ", payStatus=" + payStatus +
                ", goods='" + goods + '\'' +
                ", consignee='" + consignee + '\'' +
                ", confirm_time='" + confirm_time + '\'' +
                ", receiving_time='" + receiving_time + '\'' +
                ", dispose_time='" + dispose_time + '\'' +
                '}';
    }
}