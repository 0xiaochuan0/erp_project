package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.PayMapper;
import com.jk.model.purchase.Pay;
import com.jk.service.purchase.IPayService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Service(version="1.0.0")
public class PayServiceImpl implements IPayService {

    @Autowired
    private PayMapper mapper;

    @Override
    public void addPay(Pay pay) {
        mapper.addPay(pay);
    }

    @Override
    public Pay huiPay(String supplierNumber) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("supplierNumber",supplierNumber);
        return mapper.huiPay(params);
    }

    @Override
    public void updatePay(Pay pay) {
        mapper.updatePay(pay);
    }
}
