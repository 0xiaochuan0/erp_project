package com.jk.mapper.indents;


import com.jk.model.indents.Indents;

import java.util.List;
import java.util.Map;

public interface IndentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Indents record);

    int insertSelective(Indents record);

    Indents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Indents record);

    int updateByPrimaryKey(Indents record);


    List<Indents> queryList(Map<String, Object> map);

    Integer queryCount(Map<String, Object> map);

    List<Indents> showIndents();

    void insertMany(List<Indents> list);
}