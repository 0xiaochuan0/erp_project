package com.jk.mapper.purchase;


import com.jk.model.purchase.Credential;
import com.jk.model.purchase.Good;
import com.jk.model.purchase.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
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

    Purchase huiPurchase(Map<String, Object> params);

    void updatePurchase(Purchase purchase);

    void addGood(@Param("goods") ArrayList<Good> goods);

    void addGood1(Good good);

    List<Good> huiGood(Map<String, Object> supplierNumber);

    void addZheng(Credential credential);

    void updatStatus(Map<String, Object> params);
}