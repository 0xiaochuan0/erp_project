package com.jk.mapper.warehouse;

import com.jk.model.warehouse.WarehouseRegion;

import java.util.List;
import java.util.Map;

public interface WarehouseRegionMapper {
    int deleteByPrimaryKey(Integer regionId);

    int insert(WarehouseRegion record);

    int insertSelective(WarehouseRegion record);

    WarehouseRegion selectByPrimaryKey(Integer regionId);

    int updateByPrimaryKeySelective(WarehouseRegion record);

    int updateByPrimaryKey(WarehouseRegion record);

    List<WarehouseRegion> queryList(Map<String, Object> map);

    Integer queryCount(Map<String, Object> map);
}