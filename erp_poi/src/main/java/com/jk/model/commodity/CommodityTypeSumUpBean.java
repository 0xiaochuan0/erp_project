package com.jk.model.commodity;

import java.io.Serializable;

public class CommodityTypeSumUpBean implements Serializable {
    private static final long serialVersionUID = -3194554705133246162L;
    private Integer id;
    /**
     * 一级类型
     */
    private Integer type_one_id;
    private String  type_one_name;
    /**
     * 二级类型
     */
    private Integer type_two_id;
    private String  type_two_name;
    /**
     * 属性组名称
     */
    private Integer type_three_id;
    private String  type_three_name;
    /**
     * 包含属性
     */
    private Integer type_four_id;
    private String  type_four_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType_two_id() {
        return type_two_id;
    }

    public void setType_two_id(Integer type_two_id) {
        this.type_two_id = type_two_id;
    }

    public Integer getType_three_id() {
        return type_three_id;
    }

    public void setType_three_id(Integer type_Three_id) {
        this.type_three_id = type_Three_id;
    }

    public Integer getType_four_id() {
        return type_four_id;
    }

    public void setType_four_id(Integer type_four_id) {
        this.type_four_id = type_four_id;
    }

    public String getType_two_name() {
        return type_two_name;
    }

    public void setType_two_name(String type_two_name) {
        this.type_two_name = type_two_name;
    }

    public String getType_Three_name() {
        return type_three_name;
    }

    public void setType_Three_name(String type_Three_name) {
        this.type_three_name = type_Three_name;
    }

    public String getType_four_name() {
        return type_four_name;
    }

    public void setType_four_name(String type_four_name) {
        this.type_four_name = type_four_name;
    }

    public Integer getType_one_id() {
        return type_one_id;
    }

    public void setType_one_id(Integer type_one_id) {
        this.type_one_id = type_one_id;
    }

    public String getType_one_name() {
        return type_one_name;
    }

    public void setType_one_name(String type_one_name) {
        this.type_one_name = type_one_name;
    }

    @Override
    public String toString() {
        return "CommodityTypeSumUpBean{" +
                "id=" + id +
                ", type_one_id=" + type_one_id +
                ", type_one_name='" + type_one_name + '\'' +
                ", type_two_id=" + type_two_id +
                ", type_two_name='" + type_two_name + '\'' +
                ", type_Three_id=" + type_three_id +
                ", type_Three_name='" + type_three_name + '\'' +
                ", type_four_id=" + type_four_id +
                ", type_four_name='" + type_four_name + '\'' +
                '}';
    }
}
