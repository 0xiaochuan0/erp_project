package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.service.commodity.CommodityTableService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("commodityTable")
public class CommodityTableController {

    @Reference(version = "1.0.0")
    private CommodityTableService CommodityTableService;

    /**
     *
     *
     */
    @RequiresPermissions("commodityTable:query")
    @RequestMapping("CommodityTable")
    public String CommodityTable(){
        return "commodity/CommodityTable";
    }

    @RequestMapping("addCommodity")
    public String addCommodity(){
        return "commodity/AddCommodity";
    }

    @RequiresPermissions("commodityTable:query")
    @RequestMapping("queryCommodityTable")
    @ResponseBody
    public ResultPage queryCommodityTable(Integer page,Integer rows,CommodityTableBean commodityTableBean){
        ResultPage resultPage= CommodityTableService.queryCommodityTable(page ,rows,commodityTableBean);
        return resultPage;
    }
    @RequiresPermissions("commodityTableUpState:update")
    @RequestMapping("upState")
    @ResponseBody
    public boolean upState(CommodityTableBean commodityTableBean){
        boolean  startus=CommodityTableService.upState(commodityTableBean);
        return startus;
    }
    @RequiresPermissions("commodityTable:save")
    @RequestMapping("SaveCommodityTableBean")
    @ResponseBody
    public boolean SaveCommodityTableBean(CommodityTableBean commodityTableBean){
        boolean  startus=CommodityTableService.SaveCommodityTableBean(commodityTableBean);
        return startus;
    }
    @RequiresPermissions("commodityTable:updata")
    @RequestMapping("getCommodityTableBean")
    @ResponseBody
    public CommodityTableBean getCommodityTableBean(Integer id){
        CommodityTableBean  commodityTableBean=CommodityTableService.getCommodityTableBean(id);
        return commodityTableBean;
    }
    @RequestMapping("commodityTrademar")
    @ResponseBody
    public List<CommodityTableBean> queryCommodityTrademar(){
        List<CommodityTableBean>  commodityTableBean=CommodityTableService.queryCommodityTrademar();
        return commodityTableBean;
    }

    @RequestMapping("queryTypeWhereId")
    @ResponseBody
    public CommodityTypeBean queryTypeWhereId(Integer id){
        CommodityTypeBean  commodityTableBean=CommodityTableService.queryTypeWhereId(id);
        return commodityTableBean;
    }


    @RequestMapping("queryTypeAttributeWhereid")
    @ResponseBody
    public CommodityTypeSumUpBean queryTypeAttributeWhereid(Integer id){
        CommodityTypeSumUpBean  commodityTableBean=CommodityTableService.queryTypeAttributeWhereid(id);
        return commodityTableBean;
    }


}
