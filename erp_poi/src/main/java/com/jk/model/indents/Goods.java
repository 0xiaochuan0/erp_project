package com.jk.model.indents;

import java.io.Serializable;
/**
 * @program: erp_project
 * @description:
 * @author: 孙佳
 * @create: 2019-01-02 20:13
 **/
public class Goods implements Serializable{

    private static final long serialVersionUID = -8079211517381637732L;
    private Integer id;
    private String name;
    private Integer price;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
