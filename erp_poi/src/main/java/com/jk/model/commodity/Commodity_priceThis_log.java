package com.jk.model.commodity;

import java.io.Serializable;

public class Commodity_priceThis_log implements Serializable{
    private static final long serialVersionUID = 5394366577578332128L;
    private Integer id;

    /**
     *开始的时间 和更改的时间
     */
    private String time ;
    private Integer Commodity_priceThis_id;
    /**
     * 进价
     */
    private String  pricePurchasing;
    /**
     * 销售
     */
    private String  sellingPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCommodity_priceThis_id() {
        return Commodity_priceThis_id;
    }

    public void setCommodity_priceThis_id(Integer commodity_Table_id) {
        Commodity_priceThis_id = commodity_Table_id;
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

    @Override
    public String toString() {
        return "Commodity_priceThis_log{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", Commodity_priceThis_id=" + Commodity_priceThis_id +
                ", pricePurchasing='" + pricePurchasing + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                '}';
    }
}
