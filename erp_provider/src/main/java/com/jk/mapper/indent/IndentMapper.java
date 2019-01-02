package com.jk.mapper.indent;

import com.jk.model.indent.Indent;

import java.util.List;
import java.util.Map;

public interface IndentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Indent record);

    int insertSelective(Indent record);

    Indent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Indent record);

    int updateByPrimaryKey(Indent record);

    List<Map<String, Object>> queryYear();

    /*List<Map<String, Object>> queryFinance();*/
    List<Indent> queryFinance();
}