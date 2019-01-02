package com.jk.mapper.warehouse;



import com.jk.model.warehouse.WarehouseManage;

import java.util.List;
import java.util.Map;

public interface WarehouseManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseManage record);

    int insertSelective(WarehouseManage record);

    WarehouseManage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WarehouseManage record);

    int updateByPrimaryKey(WarehouseManage record);

    List<WarehouseManage> queryList(Map<String, Object> map);


    Integer queryCount(Map<String, Object> map);
}