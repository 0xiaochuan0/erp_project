package com.jk.model.commodity;

import java.io.Serializable;

/**
 * Commodity_Table	商品表
 */
public class CommodityTableBean implements Serializable {

    private static final long serialVersionUID = 6867239093932568583L;

    //主键
    private Integer id;
    //名称
    private String  name;
    //编号
    private String number;
    //开始上架时间
    private String timeStart;
    //结束上架时间
    private String timeEnd;
    //图片表Id
    private Integer  imgId;
    //一级分类ID
    private Integer typeId;
    //二级分类ID
    private Integer typeId2;
    //价格本Id
    private Integer priceThisId;
    //价格本Id:品牌Name
    private String trademark;
    //价格本Id:销售价格sellingPrice
    private String sellingPrice;
    //库存预警值
    private Integer inventoryWarningValue;
    //属性ID
    private Integer attributeId;
    //说明
    private String  explain;
    //上 下 架
    private Integer state;

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

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeId2() {
        return typeId2;
    }

    public void setTypeId2(Integer typeId2) {
        this.typeId2 = typeId2;
    }

    public Integer getPriceThisId() {
        return priceThisId;
    }

    public void setPriceThisId(Integer priceThisId) {
        this.priceThisId = priceThisId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Integer getInventoryWarningValue() {
        return inventoryWarningValue;
    }

    public void setInventoryWarningValue(Integer inventoryWarningValue) {
        this.inventoryWarningValue = inventoryWarningValue;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "CommodityTableBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", imgId=" + imgId +
                ", typeId=" + typeId +
                ", typeId2=" + typeId2 +
                ", priceThisId=" + priceThisId +
                ", trademark='" + trademark + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", inventoryWarningValue=" + inventoryWarningValue +
                ", attributeId=" + attributeId +
                ", explain='" + explain + '\'' +
                ", state=" + state +
                '}';
    }
}
