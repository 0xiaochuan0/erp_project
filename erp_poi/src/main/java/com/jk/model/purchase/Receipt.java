package com.jk.model.purchase;

import java.io.Serializable;

public class Receipt implements Serializable {
    private static final long serialVersionUID = 512818890011009778L;
    private Integer id;

    private String adress;

    private String taxNumber;

    private String bank;

    private String bankAdress;

    private Integer priceAndTax;

    private String taxRate;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress == null ? null : bankAdress.trim();
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
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}