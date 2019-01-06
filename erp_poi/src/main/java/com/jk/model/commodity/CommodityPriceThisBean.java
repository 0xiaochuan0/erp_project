package com.jk.model.commodity;

import java.io.Serializable;

public class CommodityPriceThisBean implements Serializable {
    private static final long serialVersionUID = -3194554705133246162L;
    private Integer id;

    //商品名称
    private String  name;
    //编号
    private String number;
    /**
     * 品牌
     */
    private String trademark;
    /**
     * 进价
     */
    private String  pricePurchasing;
    /**
     * 销售
     */
    private String  sellingPrice;
    private Integer Commodity_TypeSumUpId;
    /**
     * 分类
     */
    private String classify;
    /**
     *规格
     */
    private String  specification;
    /**
     * 单位
     */
    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getPricePurchasing() {
        return pricePurchasing;
    }

    public void setPricePurchasing(String pricePurchasing) {
        this.pricePurchasing = pricePurchasing;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getCommodity_TypeSumUpId() {
        return Commodity_TypeSumUpId;
    }

    public void setCommodity_TypeSumUpId(Integer commodity_TypeSumUpId) {
        Commodity_TypeSumUpId = commodity_TypeSumUpId;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "CommodityPriceThisBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", trademark='" + trademark + '\'' +
                ", pricePurchasing='" + pricePurchasing + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", Commodity_TypeSumUpId=" + Commodity_TypeSumUpId +
                ", classify='" + classify + '\'' +
                ", specification='" + specification + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
