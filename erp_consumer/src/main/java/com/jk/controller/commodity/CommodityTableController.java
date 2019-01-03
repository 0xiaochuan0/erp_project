package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.service.commodity.CommodityTableService;
import com.jk.utils.ResultPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("commodityTable")
public class CommodityTableController {

    @Reference(version = "1.0.0")
    private CommodityTableService CommodityTableService;

    /**
     *
     *
     */
    @RequestMapping("CommodityTable")
    public String CommodityTable(){
        return "commodity/CommodityTable";
    }

    @RequestMapping("queryCommodityTable")
    @ResponseBody
    public ResultPage queryCommodityTable(Integer page,Integer rows,CommodityTableBean commodityTableBean){
        ResultPage resultPage= CommodityTableService.queryCommodityTable(page ,rows,commodityTableBean);
        return resultPage;
    }

    @RequestMapping("upState")
    @ResponseBody
    public boolean upState(CommodityTableBean commodityTableBean){
        boolean  startus=CommodityTableService.upState(commodityTableBean);
        return startus;
    }


}
