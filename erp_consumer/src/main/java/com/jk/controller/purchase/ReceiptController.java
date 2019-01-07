package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Receipt;
import com.jk.service.purchase.IPurchaseService;
import com.jk.service.purchase.IReceiptService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("receipt")
public class ReceiptController {
    @Reference(version = "1.0.0")
    private IReceiptService receiptService;

    @RequiresPermissions("addPurchse:save")
    @RequestMapping("addReceipt")
    @ResponseBody
    public boolean  addReceipt(Receipt  receipt){
        if(receipt.getReceiptId()!=null){
            receiptService.updateReceipt(receipt);
        }else{
            receiptService.addReceipt(receipt);
        }
        return  true;
    }


    @RequestMapping("huiReceipt")
    @ResponseBody
    public Receipt  huiReceipt(HttpServletRequest request){
        String supplierNumber = (String) request.getSession().getAttribute("supplierNumber");
        System.out.println(supplierNumber);
        return   receiptService.huiReceipt(supplierNumber);
    }



}
