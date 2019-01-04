package com.jk.mapper.warehouse;

import com.jk.model.warehouse.WarehouseShelf;

public interface WarehouseShelfMapper {
    int deleteByPrimaryKey(Integer shelfId);

    int insert(WarehouseShelf record);

    int insertSelective(WarehouseShelf record);

    WarehouseShelf selectByPrimaryKey(Integer shelfId);

    int updateByPrimaryKeySelective(WarehouseShelf record);

    int updateByPrimaryKey(WarehouseShelf record);
}