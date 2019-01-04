package com.jk.service.purchase;

import com.jk.model.purchase.Purchase;
import com.jk.utils.ResultPage;

public interface IPurchaseService {


    ResultPage queryPurchase(Integer page, Integer rows, Purchase puerchaser);

    void addPurchase(Purchase purchase);
}
