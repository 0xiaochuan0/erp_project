package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.Commodity_priceThis_log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommodityPriceThisMapper {

    Integer queryCommodityPriceThisCount(HashMap<String, Object> map);

    List<CommodityTableBean> queryCommodityPriceThisList(HashMap<String, Object> map);

    List<Commodity_priceThis_log> queryCommodity_priceThis_log(Integer id);

    void SaveOrUpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis);

    void UpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis);

    CommodityPriceThisBean getCommodity_priceThis(Integer id);

    List<Commodity_priceThis_log> queryCommodity_priceThis_logGetSellingPrice(Integer id);

    List<Commodity_priceThis_log> queryCommodity_priceThis_logGetPricePurchasing(Integer id);

    void SaveCommodity_priceThis_log(Commodity_priceThis_log commodity_priceThis_log);
}
