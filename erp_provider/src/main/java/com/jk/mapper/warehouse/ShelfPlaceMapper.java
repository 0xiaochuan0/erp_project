package com.jk.mapper.warehouse;

import com.jk.model.warehouse.ShelfPlace;

import java.util.List;

public interface ShelfPlaceMapper {
    int deleteByPrimaryKey(Integer placeId);

    int insert(ShelfPlace record);

    int insertSelective(ShelfPlace record);

    ShelfPlace selectByPrimaryKey(Integer placeId);

    int updateByPrimaryKeySelective(ShelfPlace record);

    int updateByPrimaryKey(ShelfPlace record);

    List<ShelfPlace> queryManagement(ShelfPlace shelfPlace);

    List<ShelfPlace> queryReport(ShelfPlace shelfPlace);




}