package com.jk.mapper.purchase;

import com.jk.model.purchase.Pay;

import java.util.Map;

public interface PayMapper {
    void addPay(Pay pay);

    Pay huiPay(Map<String, Object> params);

    void updatePay(Pay pay);
}
