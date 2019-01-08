package com.jk.service.purchase;

import com.jk.model.purchase.Credential;
import com.jk.model.purchase.Good;
import com.jk.model.purchase.Purchase;
import com.jk.utils.ResultPage;

import java.util.List;

public interface IPurchaseService {


    ResultPage queryPurchase(Integer page, Integer rows, Purchase puerchaser,String  creatate);

    void addPurchase(Purchase purchase);

    Purchase huiPurchase(String supplierNumber);

    void updatePurchase(Purchase purchase);

    void addGood(String arr);

    List<Good> huiGood(String supplierNumber);

    void addZheng(Credential credential);

    void updatStatus(String num, Integer status);
}
