package com.jk.mapper.purchase;


import com.jk.model.purchase.Purchase;

import java.util.List;
import java.util.Map;

public interface PurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    Purchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    Integer countPurchase(Map<String, Object> params);

    List<Purchase> queryPurchase(Map<String, Object> params);

    void addPurchase(Purchase purchase);

    Purchase huiPurchase(Integer id);
}