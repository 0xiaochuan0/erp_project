package com.jk.controller.purchase;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Cai;
import com.jk.model.purchase.Purchase;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.service.purchase.ICaiService;
import com.jk.service.purchase.IPayService;
import com.jk.utils.ResultPage;
import org.apache.poi.hslf.record.CString;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("cai")
public class CaiController {

    @Reference(version = "1.0.0")
    private ICaiService payService;

    @RequiresPermissions("savePurchase:save")
    @RequestMapping("savePurchase")
    public String  savePurchase(){
        return  "purchase/editPurchaseRequisition";
    }

    @RequestMapping("toAuditingPurchaseRequisition")
    public String  toAuditingPurchaseRequisition(){
        return  "purchase/auditingPurchaseRequisition";
    }

    @RequiresPermissions("caiGou:query")
    @RequestMapping("showCai")
    @ResponseBody
    public ResultPage showCai(Integer  page, Integer  rows, Cai cai,String creatda){

        return  payService.showCai(page, rows,cai,creatda);
    }

    @RequestMapping("selectType")
    @ResponseBody
    public List<PurchaseRequisitionBean>   selectType(){
        List<PurchaseRequisitionBean>  list=  payService.selectType();
        return list;
    }

    @RequestMapping("queryGood")
    @ResponseBody
    public ResultPage queryGood(Integer  page, Integer  rows, String  qingNum){

        return  payService.queryGood(page, rows,qingNum);
    }

    @RequiresPermissions("savePurchase:save")
    @RequestMapping("addCai")
    @ResponseBody
    public  boolean  addCai(String objss) throws ParseException {
        payService.addCai(objss);
        return  true;
    }
    @RequiresPermissions("updatcai:update")
    @RequestMapping("updatStatus")
    @ResponseBody
    public  boolean  updatStatus(String  num,Integer  id,Integer  status){
        payService.updatStatus(num,id,status);
        return  true;
    }

}
