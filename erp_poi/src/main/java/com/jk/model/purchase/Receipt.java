package com.jk.model.purchase;

import java.io.Serializable;

public class Receipt implements Serializable {
    private static final long serialVersionUID = 512818890011009778L;
    private Integer receiptId;

    private String adressCom;

    private String taxNumber;

    private String bank;

    private String bankAdress;

    private Integer priceAndTax;

    private String taxRate;

    private Integer userId;

    private  String  supplierNumberFaPiao;

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }



    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }

    public Integer getPriceAndTax() {
        return priceAndTax;
    }

    public void setPriceAndTax(Integer priceAndTax) {
        this.priceAndTax = priceAndTax;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSupplierNumberFaPiao() {
        return supplierNumberFaPiao;
    }

    public void setSupplierNumberFaPiao(String supplierNumberFaPiao) {
        this.supplierNumberFaPiao = supplierNumberFaPiao;
    }

    public String getAdressCom() {
        return adressCom;
    }

    public void setAdressCom(String adressCom) {
        this.adressCom = adressCom;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptId=" + receiptId +
                ", adressCom='" + adressCom + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", priceAndTax=" + priceAndTax +
                ", taxRate='" + taxRate + '\'' +
                ", userId=" + userId +
                ", supplierNumberFaPiao='" + supplierNumberFaPiao + '\'' +
                '}';
    }

    public Receipt(Integer receiptId, String adressCom, String taxNumber, String bank, String bankAdress, Integer priceAndTax, String taxRate, Integer userId, String supplierNumberFaPiao) {
        this.receiptId = receiptId;
        this.adressCom = adressCom;
        this.taxNumber = taxNumber;
        this.bank = bank;
        this.bankAdress = bankAdress;
        this.priceAndTax = priceAndTax;
        this.taxRate = taxRate;
        this.userId = userId;
        this.supplierNumberFaPiao = supplierNumberFaPiao;
    }

    public Receipt() {
    }
}