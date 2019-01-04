package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseManage;
import com.jk.utils.ResultPage;

public interface IWarehouseManageService {
    ResultPage queryListStock(Integer page, Integer rows, WarehouseManage warehouseManage);

    void inStorage(Integer id);
}
