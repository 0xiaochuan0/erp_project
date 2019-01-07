package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.service.commodity.CommodityTypeSumUpService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("commodityTypeSumUp")
public class CommodityTypeSumUpController {

    @Reference(version = "1.0.0")
    private CommodityTypeSumUpService commodityTypeSumUpService;

    @RequiresPermissions("commodityTypeSumUp:query")
    @RequestMapping("CommodityTypeSumUp")
    public String CommodityTable(){
        return "commodity/commodityTypeSumUp";
    }

    @RequiresPermissions("commodityTypeSumUp:query")
    @RequestMapping("queryCommodityTypeSumUp")
    @ResponseBody
    public ResultPage queryCommodityTypeSumUp(Integer page, Integer rows, CommodityTypeSumUpBean commodityTypeSumUp){
        ResultPage resultPage= commodityTypeSumUpService.queryCommodityTypeSumUp(page ,rows,commodityTypeSumUp);
        return resultPage;
    }

    @RequiresPermissions("commodityTypeSumUp:delete")
    @RequestMapping("delsCommodityTypeSumUp")
    @ResponseBody
    public boolean delsCommodityTypeSumUp(String  ids){
        boolean  startus=commodityTypeSumUpService.delsCommodityTypeSumUp(ids);
        return startus;
    }
    @RequestMapping("AddCommodityTypeSumUp")
    public String AddCommodityTypeSumUp(){
        return "commodity/AddCommodityTypeSumUp";
    }



    @RequestMapping("getCommodityTypeSumUp")
    @ResponseBody
    public List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id){
        List<CommodityTypeSumUpBean> list= commodityTypeSumUpService.getCommodityTypeSumUp(id);
        return list;
    }

    @RequiresPermissions("commodityTypeSumUp:save")
    @RequestMapping("SaveOrUpdateCommodityTypeSumUp")
    @ResponseBody
    public Boolean SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp  , Integer[] type_valueArr){
        return commodityTypeSumUpService.SaveOrUpdateCommodityTypeSumUp(commodityTypeSumUp,type_valueArr);
    }

    @RequestMapping("queryType")
    @ResponseBody
    public List<CommodityTypeBean> queryType(Integer id){
        List<CommodityTypeBean> typeOneList=commodityTypeSumUpService.queryType(id);
        return typeOneList;
    }

    @RequestMapping("queryType_key")
    @ResponseBody
    public List<CommodityTypeBean> queryType_key(){
        List<CommodityTypeBean> typeOneList=commodityTypeSumUpService.queryType_key();
        return typeOneList;
    }
    @RequestMapping("queryType_value")
    @ResponseBody
    public List<CommodityTypeBean> queryType_value(CommodityTypeSumUpBean commodityTypeSumUp){
        List<CommodityTypeBean> typeOneList=commodityTypeSumUpService.queryType_value(commodityTypeSumUp);
        return typeOneList;
    }


}
