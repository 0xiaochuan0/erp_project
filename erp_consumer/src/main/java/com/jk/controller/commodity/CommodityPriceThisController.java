package com.jk.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.service.commodity.CommodityPriceThisService;
import com.jk.utils.ResultPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("commodityPriceThis")
public class CommodityPriceThisController {

    @Reference(version = "1.0.0")
    private CommodityPriceThisService commodityPriceThisService;

    @RequestMapping("CommodityPriceThis")
    public String CommodityTable(){
        return "commodity/commodityPriceThis";
    }

    @RequestMapping("queryCommodityPriceThis")
    @ResponseBody
    public ResultPage queryCommodityPriceThis(Integer page, Integer rows, CommodityPriceThisBean commodityPriceThis){
        ResultPage resultPage= commodityPriceThisService.queryCommodityPriceThis(page ,rows,commodityPriceThis);
        return resultPage;
    }
    @RequestMapping("queryCommodity_priceThis_log")
    @ResponseBody
    public List<Map<String,Object>> queryCommodity_priceThis_log(Integer id){
        List<Map<String,Object>> listMap=new ArrayList<Map<String,Object>>();
        List<Map<String,Object>> queryBookList = commodityPriceThisService.queryCommodity_priceThis_log(id);
        for (Map<String, Object> map : queryBookList) {
            Map<String,Object> addMap=new HashMap<String,Object>();

            addMap.put("data",map.get(""));
            map.put("name",map.get(""));
            listMap.add(addMap);
        }
        return listMap;
    }

    @RequestMapping("AddCommodityPriceThis")
    public String AddCommodityPriceThis(){
        return "commodity/AddCommodityPriceThis";
    }

    @RequestMapping("SaveOrUpdateCommodityPriceThis")
    @ResponseBody
    public Boolean SaveOrUpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis){
        Boolean  bol =commodityPriceThisService.SaveOrUpdateCommodityPriceThis(commodityPriceThis);
        return bol;
    }
    @RequestMapping("getCommodity_priceThis")
    @ResponseBody
    public CommodityPriceThisBean getCommodity_priceThis(Integer id){
        CommodityPriceThisBean  bol =commodityPriceThisService.getCommodity_priceThis(id);
        return bol;
    }

}
