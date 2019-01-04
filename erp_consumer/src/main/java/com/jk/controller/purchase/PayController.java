package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Pay;
import com.jk.service.purchase.IPayService;
import com.jk.service.purchase.IReceiptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("pay")
public class PayController {

    @Reference(version = "1.0.0")
    private IPayService payService;

    @RequestMapping("addPay")
    @ResponseBody
    public  boolean  addPay(Pay pay){
        payService.addPay(pay);
        return  true;
    }
}
