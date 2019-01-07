/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShelfPlaceController
 * Author:   Divine
 * Date:     2019/1/4 20:28
 * Description: ShelfPlaceController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.warehouse;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.warehouse.ShelfPlace;

import com.jk.service.warehouse.IShelfPlaceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 〈一句话功能简述〉<br> 
 * 〈ShelfPlaceController〉
 *
 * @author Divine
 * @create 2019/1/4
 * @since 1.0.0
 */
@Controller
@RequestMapping("shelfplace")
public class ShelfPlaceController {
    @Reference(version = "1.0.0")
    private IShelfPlaceService shelfPlaceService;

    @RequiresPermissions("management:query")
    @RequestMapping("toManagement")
    public String  toManagement(){
        return "warehouse/management";
    }

    @RequiresPermissions("report:query")
    @RequestMapping("toReport")
    public String  toReport(){
        return "warehouse/report";
    }

    /**
     * 查询仓库管理
     * @return
     */
    @RequestMapping("queryReport")
    @ResponseBody
    public List<ShelfPlace> queryReport(ShelfPlace shelfPlace){
        List<ShelfPlace> r = shelfPlaceService.queryReport(shelfPlace);
        return r;
    }

    /**
     * 查询查询仓库报表
     * @return
     */
    @RequestMapping("queryManagement")
    @ResponseBody
    public List<ShelfPlace> queryManagement(ShelfPlace shelfPlace){
        List<ShelfPlace> m = shelfPlaceService.queryManagement(shelfPlace);
        return m;
    }
}
