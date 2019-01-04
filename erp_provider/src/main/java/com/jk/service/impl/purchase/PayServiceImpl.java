package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.PayMapper;
import com.jk.model.purchase.Pay;
import com.jk.service.purchase.IPayService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0.0")
public class PayServiceImpl implements IPayService {

    @Autowired
    private PayMapper mapper;

    @Override
    public void addPay(Pay pay) {
        mapper.addPay(pay);
    }
}
