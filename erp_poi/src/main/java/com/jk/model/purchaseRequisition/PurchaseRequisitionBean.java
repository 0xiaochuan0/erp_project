package com.jk.model.purchaseRequisition;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jk.model.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class PurchaseRequisitionBean extends Page implements Serializable {

    private static final long serialVersionUID = 3826877393630495518L;

    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date originateTime;

    private String purchaseRequisitionIdentifier;

    private Integer status;

    private String originateMan;

    private String personInCharge;

    private String auditor;

    private String comments;

    private String arrivalAddress;

    private Integer commodityId;

    private Integer purchaseRequisitionNumber;

    private Double unitPrice;
    /**
     * 业务使用 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date startOriginateTime;

    /**
     * 业务使用 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endOriginateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOriginateTime() {
        return originateTime;
    }

    public void setOriginateTime(Date originateTime) {
        this.originateTime = originateTime;
    }

    public String getPurchaseRequisitionIdentifier() {
        return purchaseRequisitionIdentifier;
    }

    public void setPurchaseRequisitionIdentifier(String purchaseRequisitionIdentifier) {
        this.purchaseRequisitionIdentifier = purchaseRequisitionIdentifier;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOriginateMan() {
        return originateMan;
    }

    public void setOriginateMan(String originateMan) {
        this.originateMan = originateMan;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getPurchaseRequisitionNumber() {
        return purchaseRequisitionNumber;
    }

    public void setPurchaseRequisitionNumber(Integer purchaseRequisitionNumber) {
        this.purchaseRequisitionNumber = purchaseRequisitionNumber;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getStartOriginateTime() {
        return startOriginateTime;
    }

    public void setStartOriginateTime(Date startOriginateTime) {
        this.startOriginateTime = startOriginateTime;
    }

    public Date getEndOriginateTime() {
        return endOriginateTime;
    }

    public void setEndOriginateTime(Date endOriginateTime) {
        this.endOriginateTime = endOriginateTime;
    }
}