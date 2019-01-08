package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;

import java.util.HashMap;
import java.util.List;

public interface CommodityTableMapper {

    Integer queryCommodityTableCount(HashMap<String,Object> map);

    List<CommodityTableBean> queryCommodityTableList(HashMap<String, Object> map);

    void upState(CommodityTableBean commodityTableBean);

    void SaveCommodityTableBean(CommodityTableBean commodityTableBean);

    void UpCommodityTableBean(CommodityTableBean commodityTableBean);

    CommodityTableBean getCommodityTableBean(Integer id);

    List<CommodityTableBean> queryCommodityTrademar();

    CommodityTypeBean queryTypeWhereId(Integer id);

    CommodityTypeSumUpBean queryTypeAttributeWhereid(Integer id);
}
