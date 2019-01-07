package com.jk.service.impl.purchaseRequisition;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchaseRequisition.PurchaseRequisitionBeanMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.good.GoodBean;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.service.purchaseRequisition.PurchaseRequisitionService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(version = "1.0.0")
public class PurchaseRequisitionServiceImpl implements PurchaseRequisitionService {
    @Autowired
    PurchaseRequisitionBeanMapper purchaseRequisitionBeanMapper;

    @Override
    public ResultPage queryPurchaseRequisitionPage(PurchaseRequisitionBean purchaseRequisitionBean) {
        purchaseRequisitionBean.calculate();
        ResultPage resultPage = new ResultPage();
        int count = purchaseRequisitionBeanMapper.queryPurchaseRequisitionCount(purchaseRequisitionBean);
        resultPage.setTotal(count);
        List<PurchaseRequisitionBean> list = purchaseRequisitionBeanMapper.queryPurchaseRequisitionList(purchaseRequisitionBean);
        resultPage.setRows(list);
        return resultPage;
    }

    @Override
    public ResultPage queryGoodPage(CommodityTableBean commodityTableBean) {
       // commodityTableBean.calculate();
        ResultPage resultPage = new ResultPage();
        int goodCount = purchaseRequisitionBeanMapper.queryGoodCount(commodityTableBean);
        resultPage.setTotal(goodCount);
        List<CommodityTableBean> goodList = purchaseRequisitionBeanMapper.queryGoodList(commodityTableBean);
        resultPage.setRows(goodList);
        return resultPage;
    }

    @Override
    public ResultPage queryGoodListByIds(String ids) {
        ResultPage resultPage = new ResultPage();
        String[] split = ids.split(",");
        List<CommodityTableBean> goodList = purchaseRequisitionBeanMapper.queryGoodListByIds(split);
        resultPage.setRows(goodList);
        resultPage.setTotal(goodList.size());
        return resultPage;
    }

    @Override
    public void savePurchaseRequisition(PurchaseRequisitionBean purchaseRequisitionBean, String str) {
        String[] split = str.split(",");
        ArrayList<PurchaseRequisitionBean> arrayList = new ArrayList<>();
        String purchaseRequisitionIdentifier = "QG" + new Date().getTime();
        PurchaseRequisitionBean bean = null;
        if (StringUtils.isEmpty(purchaseRequisitionBean.getPurchaseRequisitionIdentifier())){
            for (int i = 0; i < split.length; i++) {
                bean = new PurchaseRequisitionBean();
                String[] strings = split[i].split("-");
                bean.setOriginateTime(purchaseRequisitionBean.getOriginateTime());
                bean.setOriginateMan(purchaseRequisitionBean.getOriginateMan());
                bean.setArrivalAddress(purchaseRequisitionBean.getArrivalAddress());
                bean.setComments(purchaseRequisitionBean.getComments());
                bean.setStatus(1);
                bean.setPurchaseRequisitionIdentifier(purchaseRequisitionIdentifier);
                bean.setCommodityId(Integer.parseInt(strings[0]));
                bean.setPurchaseRequisitionNumber(Integer.parseInt(strings[1]));
                arrayList.add(bean);
            }
            purchaseRequisitionBeanMapper.savePurchaseRequisition(arrayList);
        } else {
            String[] split1 = purchaseRequisitionBean.getIds().split(",");
            for (int i = 0; i < split.length; i++) {
                bean = new PurchaseRequisitionBean();
                String[] strings = split[i].split("-");
                bean.setId(Integer.parseInt(split1[i]));
                bean.setOriginateTime(purchaseRequisitionBean.getOriginateTime());
                bean.setOriginateMan(purchaseRequisitionBean.getOriginateMan());
                bean.setArrivalAddress(purchaseRequisitionBean.getArrivalAddress());
                bean.setComments(purchaseRequisitionBean.getComments());
                bean.setPurchaseRequisitionIdentifier(purchaseRequisitionIdentifier);
                bean.setCommodityId(Integer.parseInt(strings[0]));
                bean.setPurchaseRequisitionNumber(Integer.parseInt(strings[1]));
                purchaseRequisitionBeanMapper.updatePurchaseRequisitionById(bean);
            }
            //purchaseRequisitionBeanMapper.updatePurchaseRequisitionByPurchaseRequisitionIdentifier(arrayList);
        }

    }

    @Override
    public PurchaseRequisitionBean queryPurchaseRequisitionInfoByPurchaseRequisitionIdentifier(PurchaseRequisitionBean purchaseRequisitionBean) {
        return purchaseRequisitionBeanMapper.queryPurchaseRequisitionInfoByPurchaseRequisitionIdentifier(purchaseRequisitionBean);
    }

    @Override
    public void updatePurchaseRequisitionStatusById(PurchaseRequisitionBean purchaseRequisitionBean) {
        if (purchaseRequisitionBean.getStatus() == 4){
            purchaseRequisitionBean.setComments("审核未通过原因:"+purchaseRequisitionBean.getComments());
        }
        purchaseRequisitionBeanMapper.updatePurchaseRequisitionStatusById(purchaseRequisitionBean);
    }
}
