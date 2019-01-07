package com.jk.controller.purchaseRequisition;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.good.GoodBean;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.service.purchaseRequisition.PurchaseRequisitionService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("purchaseRequisition")
public class PurchaseRequisitionController {

    @Reference(version = "1.0.0")
    private PurchaseRequisitionService purchaseRequisitionService;

    @RequiresPermissions("requestPurchase:query")
    @RequestMapping("queryPurchaseRequisitionPage")
    public ResultPage queryPurchaseRequisitionPage(PurchaseRequisitionBean purchaseRequisitionBean){
        return purchaseRequisitionService.queryPurchaseRequisitionPage(purchaseRequisitionBean);
    }

    @RequestMapping("queryGoodPage")
    public ResultPage queryGoodPage(CommodityTableBean commodityTableBean){
        return purchaseRequisitionService.queryGoodPage(commodityTableBean);
    }

    @RequestMapping("queryGoodListByIds")
    public ResultPage queryGoodListByIds(String ids){
        return purchaseRequisitionService.queryGoodListByIds(ids);
    }

    @RequiresPermissions("requestPurchase:save")
    @RequestMapping("savePurchaseRequisition")
    public Boolean savePurchaseRequisition(PurchaseRequisitionBean purchaseRequisitionBean,String str){
        System.out.println(str);
        try {
            purchaseRequisitionService.savePurchaseRequisition(purchaseRequisitionBean,str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequiresPermissions("requestPurchase:auditing")
    @RequestMapping("updatePurchaseRequisitionStatusById")
    public Boolean updatePurchaseRequisitionStatusById(PurchaseRequisitionBean purchaseRequisitionBean){
        try {
            purchaseRequisitionService.updatePurchaseRequisitionStatusById(purchaseRequisitionBean);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
