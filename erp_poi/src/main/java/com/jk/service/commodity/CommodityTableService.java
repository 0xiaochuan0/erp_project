package com.jk.service.commodity;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.utils.ResultPage;

import java.util.List;

public interface CommodityTableService {
    ResultPage queryCommodityTable(Integer page, Integer rows, CommodityTableBean commodityTableBean);

    boolean upState(CommodityTableBean commodityTableBean);

    boolean SaveCommodityTableBean(CommodityTableBean commodityTableBean);

    CommodityTableBean getCommodityTableBean(Integer id);

    List<CommodityTableBean> queryCommodityTrademar();


    CommodityTypeBean queryTypeWhereId(Integer id);

    CommodityTypeSumUpBean queryTypeAttributeWhereid(Integer id);
}
