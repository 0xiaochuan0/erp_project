package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface CommodityTypeSumUpMapper {
    void delsCommodityTypeSumUp(String ids);

    List<CommodityTableBean> queryCommodityTypeSumUpList(HashMap<String, Object> map);

    Integer queryCommodityTypeSumUpCount(HashMap<String, Object> map);


    void SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean  commodityTypeSumUp);

    void UpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp);

    List<CommodityTypeSumUpBean> getCommodityTypeSumUp();

    List<CommodityTypeBean> queryType(@Param("id") Integer id);

    List<CommodityTypeBean> queryType_key();

    List<CommodityTypeBean> queryType_value(CommodityTypeSumUpBean commodityTypeSumUp);
}
