package com.jk.service.purchase;

import com.jk.model.purchase.Cai;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.utils.ResultPage;

import java.text.ParseException;
import java.util.List;

public interface ICaiService {
    ResultPage showCai(Integer page, Integer rows, Cai cai,String creatda);

    List<PurchaseRequisitionBean> selectType();

    ResultPage queryGood(Integer page, Integer rows, String qingNum);

    void addCai(String obj) throws ParseException;

    void updatStatus(String num, Integer id, Integer status);
}
