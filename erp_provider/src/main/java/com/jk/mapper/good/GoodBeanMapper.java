package com.jk.mapper.good;

import com.jk.model.good.GoodBean;

public interface GoodBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodBean record);

    int insertSelective(GoodBean record);

    GoodBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodBean record);

    int updateByPrimaryKey(GoodBean record);
}