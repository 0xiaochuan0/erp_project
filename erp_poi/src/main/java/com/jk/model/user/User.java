/**
 * 文件名称:User.java
 * 包名:com.jk.mapper
 * 创建日期:2018年12月19日下午7:42:31
 * Copyright (c) 2018,  All Rights Reserved.</pre>
 */
package com.jk.model.user;

import java.io.Serializable;

/**
 * <pre>项目名称：springboot-highcharts
 * 类名称：User
 * 创建人：王赛
 * 创建时间：2018年12月19日 下午7:42:31
 * @version </pre>
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2140224656684462533L;
    private Integer id;

    private String name;

    private String time;

    private String sex;

    private Integer num;

    private String url;



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    /**
     * <pre>创建一个新的实例 User.
     *
     * @param id
     * @param name
     * @param time
     * @param sex
     * @param num</pre>
     */
    public User(Integer id, String name, String time, String sex, Integer num) {
        super();
        this.id = id;
        this.name = name;
        this.time = time;
        this.sex = sex;
        this.num = num;
    }


    /**
     * <pre>创建一个新的实例 User.
     *    </pre>
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", time=" + time + ", sex=" + sex + ", num=" + num + "]";
    }


}
