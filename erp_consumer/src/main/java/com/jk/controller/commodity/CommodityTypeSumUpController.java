package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.service.commodity.CommodityTypeSumUpService;
import com.jk.utils.ResultPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("commodityTypeSumUp")
public class CommodityTypeSumUpController {

    @Reference(version = "1.0.0")
    private CommodityTypeSumUpService commodityTypeSumUpService;

    @RequestMapping("CommodityTypeSumUp")
    public String CommodityTable(){
        return "commodity/commodityTypeSumUp";
    }

    @RequestMapping("queryCommodityTypeSumUp")
    @ResponseBody
    public ResultPage queryCommodityTypeSumUp(Integer page, Integer rows, CommodityTypeSumUpBean commodityTypeSumUp){
        ResultPage resultPage= commodityTypeSumUpService.queryCommodityTypeSumUp(page ,rows,commodityTypeSumUp);
        return resultPage;
    }

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




    @RequestMapping("queryTypeOne")
    @ResponseBody
    public List<CommodityTypeSumUpBean> queryTypeOne(){
        List<CommodityTypeSumUpBean> typeOneList=commodityTypeSumUpService.queryTypeOne();
        return typeOneList;
    }
    @RequestMapping("queryTypeTwo")
    @ResponseBody
    public List<CommodityTypeSumUpBean> queryTypeTwo(Integer id){
        List<CommodityTypeSumUpBean> typeOneList=commodityTypeSumUpService.queryTypeTwo(id);
        return typeOneList;
    }
    @RequestMapping("queryTypeThree")
    @ResponseBody
    public List<CommodityTypeSumUpBean> queryTypeThree(Integer id){
        List<CommodityTypeSumUpBean> typeOneList=commodityTypeSumUpService.queryTypeThree(id);
        return typeOneList;
    }
    @RequestMapping("queryTypeFour")
    @ResponseBody
    public List<CommodityTypeSumUpBean> queryTypeFour(Integer id){
        List<CommodityTypeSumUpBean> typeOneList=commodityTypeSumUpService.queryTypeFour(id);
        return typeOneList;
    }
    @RequestMapping("getCommodityTypeSumUp")
    @ResponseBody
    public List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id){
        List<CommodityTypeSumUpBean> list= commodityTypeSumUpService.getCommodityTypeSumUp(id);
        return list;
    }
    @RequestMapping("SaveOrUpdateCommodityTypeSumUp")
    @ResponseBody
    public Boolean SaveOrUpdateCommodityTypeSumUp( CommodityTypeSumUpBean commodityTypeSumUp){
        return commodityTypeSumUpService.SaveOrUpdateCommodityTypeSumUp(commodityTypeSumUp);
    }

}
