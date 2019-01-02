package com.jk.model.warehouse;

import java.io.Serializable;
import java.util.Date;

public class WarehouseDelivery implements Serializable {
    private static final long serialVersionUID = 4995276348530322306L;
    private Integer id;

    private Integer type;

    private String returnDate;

    private Integer salesReturnId;

    private Integer warehouseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getSalesReturnId() {
        return salesReturnId;
    }

    public void setSalesReturnId(Integer salesReturnId) {
        this.salesReturnId = salesReturnId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }
}