package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.ReceiptMapper;
import com.jk.model.purchase.Receipt;
import com.jk.service.purchase.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Service(version="1.0.0")
public class RceiptServiceImpl implements IReceiptService {

    @Autowired
    private ReceiptMapper   receiptMapper;

    @Override
    public void addReceipt(Receipt receipt) {
        receiptMapper.addReceipt(receipt);
    }

    @Override
    public Receipt huiReceipt(String supplierNumber) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("supplierNumber",supplierNumber);
        return receiptMapper.huiPurchase(params);
    }

    @Override
    public void updateReceipt(Receipt receipt) {
        receiptMapper.updateReceipt(receipt);
    }
}
