package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.model.commodity.CommodityTableBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommodityPriceThisMapper {

    Integer queryCommodityPriceThisCount(HashMap<String, Object> map);

    List<CommodityTableBean> queryCommodityPriceThisList(HashMap<String, Object> map);

    List<Map<String, Object>> queryCommodity_priceThis_log(Integer id);

    void SaveOrUpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis);

    void UpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis);

    CommodityPriceThisBean getCommodity_priceThis(Integer id);
}
