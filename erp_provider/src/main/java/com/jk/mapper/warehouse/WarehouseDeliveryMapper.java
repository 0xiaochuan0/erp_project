package com.jk.mapper.warehouse;

import com.jk.model.warehouse.WarehouseDelivery;

import java.util.List;
import java.util.Map;

public interface WarehouseDeliveryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseDelivery record);

    int insertSelective(WarehouseDelivery record);

    WarehouseDelivery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WarehouseDelivery record);

    int updateByPrimaryKey(WarehouseDelivery record);

    List<WarehouseDelivery> queryList(Map<String, Object> map);

    Integer queryCount(Map<String, Object> map);
}