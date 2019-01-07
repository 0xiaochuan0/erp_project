package com.jk.mapper.purchase;

import com.jk.model.purchase.Receipt;

import java.util.Map;

public interface ReceiptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    Receipt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);

    void addReceipt(Receipt receipt);

    Receipt huiPurchase(Map<String, Object> params);

    void updateReceipt(Receipt receipt);
}