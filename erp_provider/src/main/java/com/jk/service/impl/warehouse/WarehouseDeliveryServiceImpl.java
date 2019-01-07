/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseDeliveryServiceImpl
 * Author:   Divine
 * Date:     2019/1/2 22:04
 * Description: WarehouseDeliveryServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.warehouse;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.warehouse.WarehouseDeliveryMapper;
import com.jk.model.warehouse.WarehouseDelivery;
import com.jk.model.warehouse.WarehouseManage;
import com.jk.service.warehouse.IWarehouseDeliveryService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseDeliveryServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/2
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class WarehouseDeliveryServiceImpl implements IWarehouseDeliveryService {

    @Autowired
    private WarehouseDeliveryMapper warehouseDeliveryMapper;

    @Override
    public List<WarehouseDelivery> queryDelivery( WarehouseDelivery warehouseDelivery) {
        return warehouseDeliveryMapper.queryDelivery(warehouseDelivery);
    }

    @Override
    public void outStorage(Integer id) {
        warehouseDeliveryMapper.outStorage(id);
    }
}
