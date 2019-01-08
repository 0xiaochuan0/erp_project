package com.jk.mapper.purchaseRequisition;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.good.GoodBean;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.model.user.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface PurchaseRequisitionBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseRequisitionBean record);

    int insertSelective(PurchaseRequisitionBean record);

    PurchaseRequisitionBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseRequisitionBean record);

    int updateByPrimaryKey(PurchaseRequisitionBean record);

    int queryPurchaseRequisitionCount(PurchaseRequisitionBean purchaseRequisitionBean);

    List<PurchaseRequisitionBean> queryPurchaseRequisitionList(PurchaseRequisitionBean purchaseRequisitionBean);

    int queryGoodCount(CommodityTableBean commodityTableBean);

    List<CommodityTableBean> queryGoodList(CommodityTableBean commodityTableBean);

    List<CommodityTableBean> queryGoodListByIds(@Param("split") String[] split);

    void savePurchaseRequisition(@Param("arrayList") ArrayList<PurchaseRequisitionBean> arrayList);

    PurchaseRequisitionBean queryPurchaseRequisitionInfoByPurchaseRequisitionIdentifier(PurchaseRequisitionBean purchaseRequisitionBean);

    void updatePurchaseRequisitionByPurchaseRequisitionIdentifier(@Param("arrayList") ArrayList<PurchaseRequisitionBean> arrayList);

    void updatePurchaseRequisitionStatusById(PurchaseRequisitionBean purchaseRequisitionBean);

    void updatePurchaseRequisitionById(PurchaseRequisitionBean bean);

    List<UserBean> queryUserAll();

    List<PurchaseRequisitionBean> queryStatusByPurchaseRequisitionIdentifier(@Param("split") String[] split);

    void updatePersonInCharge(@Param("s") String s,@Param("strs") String strs);
}