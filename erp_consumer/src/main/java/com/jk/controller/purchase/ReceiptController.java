package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Receipt;
import com.jk.service.purchase.IPurchaseService;
import com.jk.service.purchase.IReceiptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("receipt")
public class ReceiptController {
    @Reference(version = "1.0.0")
    private IReceiptService receiptService;

    @RequestMapping("addReceipt")
    @ResponseBody
    public boolean  addReceipt(Receipt  receipt){
        receiptService.addReceipt(receipt);
        return  true;
    }

}
