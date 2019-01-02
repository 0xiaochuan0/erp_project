package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.commodity.AddCommodityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("commodity")
public class AddCommodityController {

    @Reference(version = "1.0.0")
    private AddCommodityService addCommodityService;

    @RequestMapping("addCommodity")
    public String addCommodity(){
        return "commodity/AddCommodity";
    }
    @RequestMapping("addcommodityMassage")
    public String addcommodityMassage(){
        return "commodity/AddCommodityMassage";
    }

}
