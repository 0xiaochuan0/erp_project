package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Purchase;
import com.jk.service.purchase.IPurchaseService;
import com.jk.utils.ResultPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("purchase")
public class PurchaseController {

    @Reference(version = "1.0.0")
    private IPurchaseService purchaserService;
    /***
     * 展示供应商管理页面
     */
    @RequestMapping("showPurchase")
    public String  showPurchase(){
        return  "purchase/showPurchse";
    }
    /**
     * 展示添加页面
     */
    @RequestMapping("savePurchase")
    public String  savePurchase(){
        return  "purchase/addPurchse";
    }


    /***
     *
     * 查询供应商管理页面
     */
    @RequestMapping("queryPurchase")
    @ResponseBody
    public ResultPage queryPurchase(Integer  page, Integer  rows, Purchase puerchaser){

        return  purchaserService.queryPurchase(page, rows,puerchaser);
    }
    /***
     *
     * 新增
     */
    @RequestMapping("addPurchase")
    @ResponseBody
    public boolean  addPurchase(Purchase  purchase){
        purchaserService.addPurchase(purchase);
        return  true;
    }
}