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

    void outStorage(Integer id);

    List<WarehouseDelivery> queryDelivery(WarehouseDelivery warehouseDelivery);
}