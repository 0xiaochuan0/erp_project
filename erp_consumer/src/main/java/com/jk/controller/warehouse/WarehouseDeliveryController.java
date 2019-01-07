/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseDeliveryController
 * Author:   Divine
 * Date:     2019/1/2 22:02
 * Description: WarehouseDeliveryController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.warehouse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.warehouse.WarehouseDelivery;
import com.jk.service.warehouse.IWarehouseDeliveryService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseDeliveryController〉
 *
 * @author Divine
 * @create 2019/1/2
 * @since 1.0.0
 */
@Controller
@RequestMapping("wDelivery")
public class WarehouseDeliveryController {
    @Reference(version = "1.0.0")
    private IWarehouseDeliveryService warehouseDeliveryService;

    @RequiresPermissions("delivery:query")
    @RequestMapping("toDelivery")
    public String  toDelivery(){
        return "warehouse/delivery";
    }

    @RequestMapping("queryDelivery")
    @ResponseBody
    public List<WarehouseDelivery> queryDelivery(WarehouseDelivery warehouseDelivery){
        List<WarehouseDelivery> d = warehouseDeliveryService.queryDelivery(warehouseDelivery);
        return d;
    }
    @RequestMapping("outStorage")
    @ResponseBody
    public Boolean outStorage(Integer id) {
        try {
            warehouseDeliveryService.outStorage(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
