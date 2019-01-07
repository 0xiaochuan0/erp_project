package com.jk.service.warehouse;

import com.jk.model.warehouse.WarehouseRegion;
import com.jk.utils.ResultPage;

import java.util.List;

public interface IWarehouseService {
    List<WarehouseRegion> queryDelivery(WarehouseRegion warehouseRegion);
}
