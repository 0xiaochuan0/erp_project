package com.jk.model.commodity;

import java.io.Serializable;

public class CommodityTypeSumUpBean implements Serializable {
    private static final long serialVersionUID = -3194554705133246162L;
    private Integer id;

    private String type_key;

    private String type_value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CommodityTypeSumUpBean{" +
                "id=" + id +
                ", type_key='" + type_key + '\'' +
                ", type_value='" + type_value + '\'' +
                '}';
    }
}
