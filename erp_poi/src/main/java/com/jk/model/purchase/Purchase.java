package com.jk.model.purchase;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Purchase implements Serializable {
    private static final long serialVersionUID = 1378293743616119073L;
    private Integer id;

    private String supplierNumber;

    private String supplierSource;

    private String companyName;

    private String brand;

    private String businessScope;

    private String chargePerson;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDate;

    private String simpleName;

    private String classification;

    private String contacts;

    private String profession;

    private String phone;

    private String telephone;

    private String fax;

    private String email;

    private String qq;

    private String wechat;

    private String province;

    private String area;

    private String adress;

    private  Integer  status;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierSource() {
        return supplierSource;
    }

    public void setSupplierSource(String supplierSource) {
        this.supplierSource = supplierSource;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getChargePerson() {
        return chargePerson;
    }

    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Purchase() {
    }

    public Purchase(Integer id, String supplierNumber, String supplierSource, String companyName, String brand, String businessScope, String chargePerson, Date createDate, String simpleName, String classification, String contacts, String profession, String phone, String telephone, String fax, String email, String qq, String wechat, String province, String area, String adress, Integer status, Integer userId) {
        this.id = id;
        this.supplierNumber = supplierNumber;
        this.supplierSource = supplierSource;
        this.companyName = companyName;
        this.brand = brand;
        this.businessScope = businessScope;
        this.chargePerson = chargePerson;
        this.createDate = createDate;
        this.simpleName = simpleName;
        this.classification = classification;
        this.contacts = contacts;
        this.profession = profession;
        this.phone = phone;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.qq = qq;
        this.wechat = wechat;
        this.province = province;
        this.area = area;
        this.adress = adress;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", supplierNumber='" + supplierNumber + '\'' +
                ", supplierSource='" + supplierSource + '\'' +
                ", companyName='" + companyName + '\'' +
                ", brand='" + brand + '\'' +
                ", businessScope='" + businessScope + '\'' +
                ", chargePerson='" + chargePerson + '\'' +
                ", createDate=" + createDate +
                ", simpleName='" + simpleName + '\'' +
                ", classification='" + classification + '\'' +
                ", contacts='" + contacts + '\'' +
                ", profession='" + profession + '\'' +
                ", phone='" + phone + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", province='" + province + '\'' +
                ", area='" + area + '\'' +
                ", adress='" + adress + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id.equals(purchase.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}