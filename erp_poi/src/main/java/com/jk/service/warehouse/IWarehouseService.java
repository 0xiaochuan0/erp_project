package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseRegion;
import com.jk.utils.ResultPage;

public interface IWarehouseService {
    ResultPage queryDelivery(Integer page, Integer rows, WarehouseRegion warehouseRegion);
}
