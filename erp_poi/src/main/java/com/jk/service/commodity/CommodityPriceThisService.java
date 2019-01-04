package com.jk.service.commodity;

import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.utils.ResultPage;

import java.util.List;
import java.util.Map;

public interface CommodityPriceThisService {
    ResultPage queryCommodityPriceThis(Integer page, Integer rows, CommodityPriceThisBean commodityPriceThis);

    List<Map<String, Object>> queryCommodity_priceThis_log(Integer id);

    Boolean SaveOrUpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis);

    CommodityPriceThisBean getCommodity_priceThis(Integer id);

}
