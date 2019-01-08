package com.jk.mapper.purchase;

import com.jk.model.purchase.Cai;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;

import java.util.List;
import java.util.Map;

public interface CaiMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Cai record);

    int insertSelective(Cai record);

    Cai selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Cai record);

    int updateByPrimaryKey(Cai record);

    List<Cai> showCai(Map<String, Object> params);

    Integer countCai(Map<String, Object> params);

    List<PurchaseRequisitionBean> selectType();


    void addCai(Cai cai);

    void updatStatus(Map<String, Object> params);
}