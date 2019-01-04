/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseController
 * Author:   Divine
 * Date:     2019/1/3 21:09
 * Description: WarehouseController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.warehouse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.warehouse.WarehouseRegion;
import com.jk.service.warehouse.IWarehouseService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseController〉
 *
 * @author Divine
 * @create 2019/1/3
 * @since 1.0.0
 */
@Controller
@RequestMapping("warehouse")
public class WarehouseController {
    @Reference(version = "1.0.0")
    private IWarehouseService warehouseService;

    @RequiresPermissions("indent:query")
    @RequestMapping("toWarehouse")
    public String  toWarehouse(){
        return "warehouse/warehouse";
    }

    @RequestMapping("queryWarehouse")
    @ResponseBody
    public ResultPage queryWarehouse(Integer page, Integer rows, WarehouseRegion warehouseRegion){
        ResultPage resultPage = warehouseService.queryDelivery(page, rows,warehouseRegion);
        return resultPage;
    }
}
