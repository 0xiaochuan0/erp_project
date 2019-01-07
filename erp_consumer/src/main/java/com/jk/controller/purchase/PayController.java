package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Pay;
import com.jk.model.purchase.Purchase;
import com.jk.service.purchase.IPayService;
import com.jk.service.purchase.IReceiptService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("pay")
public class PayController {

    @Reference(version = "1.0.0")
    private IPayService payService;
    @RequiresPermissions("addPurchse:save")
    @RequestMapping("addPay")
    @ResponseBody
    public  boolean  addPay(Pay pay){
        if(pay.getPayId()!=null){
            payService.updatePay(pay);
        }else{
            payService.addPay(pay);
        }

        return  true;
    }

    @RequestMapping("huiPay")
    @ResponseBody
    public Pay huiPay(HttpServletRequest request){
        String supplierNumber = (String) request.getSession().getAttribute("supplierNumber");
        System.out.println(supplierNumber);
        Pay  purchase= payService.huiPay(supplierNumber);
        return  purchase;
    }

}
