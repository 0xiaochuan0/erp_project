package com.jk.mapper.purchase;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.purchase.Cai;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;

import java.util.List;
import java.util.Map;

public interface PurchaserequisitionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseRequisitionBean record);

    int insertSelective(PurchaseRequisitionBean record);

    PurchaseRequisitionBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseRequisitionBean record);

    int updateByPrimaryKey(PurchaseRequisitionBean record);

    List<CommodityTableBean> queryGood(Map<String, Object> params);

    Integer countGood(Map<String, Object> params);


}