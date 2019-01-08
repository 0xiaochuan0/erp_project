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

    void inStorage(Integer id);

    String addManage(WarehouseManage record);

    List<WarehouseManage> queryListStock(WarehouseManage warehouseManage);
}