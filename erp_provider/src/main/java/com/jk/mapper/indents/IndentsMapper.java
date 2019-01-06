package com.jk.mapper.indents;


import com.jk.model.indents.Goods;
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

    void delIndentsByIds(Integer[] ids);

    Goods queryGoodsByName(String name);

    void updateIndentsPayStatus(Integer[] ids);

    void updateIndentsToConfirm(Integer[] ids);

    List<Map<String, Object>> queryCountByDay();

    List<Map<String, Object>> queryCountByName();

    List<Indents> queryConfirm(Map<String, Object> map);

    Integer queryCountConfirm(Map<String, Object> map);

    List<Indents> queryReturn(Map<String, Object> map);

    Integer queryCountReturn(Map<String, Object> map);


}