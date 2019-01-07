package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseDelivery;
import com.jk.utils.ResultPage;

import java.util.List;

public interface IWarehouseDeliveryService {
    List<WarehouseDelivery> queryDelivery(WarehouseDelivery warehouseDelivery);

    void outStorage(Integer id);
}
