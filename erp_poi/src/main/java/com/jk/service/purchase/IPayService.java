package com.jk.service.purchase;

import com.jk.model.purchase.Pay;

public interface IPayService {
    void addPay(Pay pay);

    Pay huiPay(String supplierNumber);

    void updatePay(Pay pay);
}
