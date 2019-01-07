package com.jk.service.purchase;

import com.jk.model.purchase.Receipt;

public interface IReceiptService {
    void addReceipt(Receipt receipt);

    Receipt huiReceipt(String supplierNumber);

    void updateReceipt(Receipt receipt);
}
