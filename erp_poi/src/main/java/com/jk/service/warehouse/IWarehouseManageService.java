package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseManage;


import java.util.List;

public interface IWarehouseManageService {
    List<WarehouseManage> queryListStock(WarehouseManage warehouseManage);

    void inStorage(Integer id);
}
