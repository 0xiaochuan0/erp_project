/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseManageController
 * Author:   Divine
 * Date:     2019/1/2 18:35
 * Description: WarehouseManageController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.warehouse;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jk.model.warehouse.WarehouseManage;
import com.jk.service.warehouse.IWarehouseManageService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseManageController〉
 *
 * @author Divine
 * @create 2019/1/2
 * @since 1.0.0
 */
@Controller
@RequestMapping("wManage")
public class WarehouseManageController {
    @Reference(version = "1.0.0")
    private IWarehouseManageService warehouseManageService;

    @RequiresPermissions("indent:query")
    @RequestMapping("toStock")
    public String  toStock(){
        return "stock";
    }

    @RequestMapping("queryStock")
    @ResponseBody
    public ResultPage queryListStock(Integer page, Integer rows, WarehouseManage warehouseManage){
        ResultPage resultPage = warehouseManageService.queryListStock(page, rows,warehouseManage);
        return resultPage;
    }
}
