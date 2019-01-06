package com.jk.model.indents;

/**
 * @program: erp_project
 * @description:
 * @author: 孙佳
 * @create: 2019-01-04 14:52
 **/
public class clothes {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "clothes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
