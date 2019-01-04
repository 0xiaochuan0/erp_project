package com.jk.mapper.warehouse;

import com.jk.model.warehouse.WarehouseArea;

public interface WarehouseAreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(WarehouseArea record);

    int insertSelective(WarehouseArea record);

    WarehouseArea selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(WarehouseArea record);

    int updateByPrimaryKey(WarehouseArea record);
}