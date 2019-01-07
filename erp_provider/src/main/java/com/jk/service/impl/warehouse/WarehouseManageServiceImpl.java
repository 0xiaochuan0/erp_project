/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseManageServiceImpl
 * Author:   Divine
 * Date:     2019/1/2 18:34
 * Description: WarehouseManageServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.warehouse;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.warehouse.WarehouseManageMapper;
import com.jk.model.warehouse.WarehouseManage;
import com.jk.service.warehouse.IWarehouseManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseManageServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/2
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class WarehouseManageServiceImpl implements IWarehouseManageService {

    @Autowired
    private WarehouseManageMapper warehouseManageMapper;


    @Override
    public List<WarehouseManage> queryListStock(WarehouseManage warehouseManage) {
        return warehouseManageMapper.queryListStock(warehouseManage);
    }

    @Override
    public void inStorage(Integer id) {
        warehouseManageMapper.inStorage(id);
    }
}
