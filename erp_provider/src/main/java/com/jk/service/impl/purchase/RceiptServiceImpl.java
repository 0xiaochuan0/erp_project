package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.ReceiptMapper;
import com.jk.model.purchase.Receipt;
import com.jk.service.purchase.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0.0")
public class RceiptServiceImpl implements IReceiptService {

    @Autowired
    private ReceiptMapper   receiptMapper;

    @Override
    public void addReceipt(Receipt receipt) {
        receiptMapper.addReceipt(receipt);
    }
}
