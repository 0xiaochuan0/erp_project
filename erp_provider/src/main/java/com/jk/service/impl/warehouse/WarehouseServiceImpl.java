/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseServiceImpl
 * Author:   Divine
 * Date:     2019/1/3 21:14
 * Description: WarehouseServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.warehouse;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.warehouse.WarehouseAreaMapper;
import com.jk.mapper.warehouse.WarehouseRegionMapper;
import com.jk.mapper.warehouse.WarehouseShelfMapper;
import com.jk.model.warehouse.WarehouseDelivery;
import com.jk.model.warehouse.WarehouseRegion;
import com.jk.service.warehouse.IWarehouseService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/3
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class WarehouseServiceImpl implements IWarehouseService {

    /*
    * 地区
    * */
    @Autowired
    private WarehouseRegionMapper warehouseRegionMapper;
    /*
     * 货区
     * */
    @Autowired
    private WarehouseAreaMapper warehouseAreaMapper;
    /*
     * 货架
     * */
    @Autowired
    private WarehouseShelfMapper warehouseShelfMapper;


    @Override
    public List<WarehouseRegion> queryDelivery(WarehouseRegion warehouseRegion) {

        return warehouseRegionMapper.queryDelivery(warehouseRegion);


    }
}
