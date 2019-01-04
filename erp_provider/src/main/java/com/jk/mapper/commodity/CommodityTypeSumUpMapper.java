package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;

import java.util.HashMap;
import java.util.List;

public interface CommodityTypeSumUpMapper {
    void delsCommodityTypeSumUp(String ids);

    List<CommodityTableBean> queryCommodityTypeSumUpList(HashMap<String, Object> map);

    Integer queryCommodityTypeSumUpCount(HashMap<String, Object> map);

    List<CommodityTypeSumUpBean> queryTypeOne();

    List<CommodityTypeSumUpBean> queryTypeTwo(Integer id);

    List<CommodityTypeSumUpBean> queryTypeThree(Integer id);

    List<CommodityTypeSumUpBean> queryTypeFour(Integer id);

    void SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp);

    void UpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp);

    List<CommodityTypeSumUpBean> getCommodityTypeSumUp();

}
