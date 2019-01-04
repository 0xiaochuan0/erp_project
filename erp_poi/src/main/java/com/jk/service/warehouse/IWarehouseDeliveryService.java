package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseDelivery;
import com.jk.utils.ResultPage;

public interface IWarehouseDeliveryService {
    ResultPage queryDelivery(Integer page, Integer rows, WarehouseDelivery warehouseDelivery);

    void outStorage(Integer id);
}
