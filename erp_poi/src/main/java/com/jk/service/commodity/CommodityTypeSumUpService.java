package com.jk.service.commodity;

import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.utils.ResultPage;

import java.util.List;

public interface CommodityTypeSumUpService {
    ResultPage queryCommodityTypeSumUp(Integer page, Integer rows, CommodityTypeSumUpBean commodityTypeSumUp);

    boolean delsCommodityTypeSumUp(String ids);

    List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id);

    Boolean SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp, Integer[] type_valueArr);

    List<CommodityTypeBean> queryType(Integer id);

    List<CommodityTypeBean> queryType_key();

    List<CommodityTypeBean> queryType_value(CommodityTypeSumUpBean commodityTypeSumUp);
}
