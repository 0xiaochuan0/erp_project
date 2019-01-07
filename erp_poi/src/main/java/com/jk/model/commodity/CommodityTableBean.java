package com.jk.model.commodity;

import com.jk.model.Page;

import java.io.Serializable;

/**
 * Commodity_Table	商品表
 */
public class CommodityTableBean extends Page implements Serializable {

    private static final long serialVersionUID = 6867239093932568583L;

    //主键
    private Integer id;
    //类型Id用于条查
    private Integer typeId;
    //属性名称
    private String  type_key;
    //包含属性
    private String  type_value;
    //商品名
    private String name;
    //编号
    private String number;
    //库存量
    private Integer inventory;
    //库存预警值
    private String inventoryWarningValue;
    //品牌
    private String trademark;

    //开始上架时间
    private String timeStart;
    //结束上架时间
    private String timeEnd;

    //属性Id key value
    /*private Integer attributeId;*/
    private String attribute_id;
    //属性名称
    private String attribute_Key;
    //包含属性
    private String attribute_Value;
    //颜色
    private String color;
    //销售价格sellingPrice
    private String sellingPrice;

    //图片表Id
    private String  imgUrl;
    //说明
    private String  explains;
    //上下架
    private Integer state;

    //进价
    private String  purchasingPrice ;

    //用于关联添加
    private String saveSId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getInventoryWarningValue() {
        return inventoryWarningValue;
    }

    public void setInventoryWarningValue(String inventoryWarningValue) {
        this.inventoryWarningValue = inventoryWarningValue;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
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

    public String getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(String attribute_id) {
        this.attribute_id = attribute_id;
    }

    public String getAttribute_Key() {
        return attribute_Key;
    }

    public void setAttribute_Key(String attribute_Key) {
        this.attribute_Key = attribute_Key;
    }

    public String getAttribute_Value() {
        return attribute_Value;
    }

    public void setAttribute_Value(String attribute_Value) {
        this.attribute_Value = attribute_Value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getExplain() {
        return explains;
    }

    public void setExplain(String explain) {
        this.explains = explain;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(String purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }

    public String getType_key() {
        return type_key;
    }

    public void setType_key(String type_key) {
        this.type_key = type_key;
    }

    public String getType_value() {
        return type_value;
    }

    public void setType_value(String type_value) {
        this.type_value = type_value;
    }

    public String getSaveSId() {
        return saveSId;
    }

    public void setSaveSId(String saveSId) {
        this.saveSId = saveSId;
    }
}
