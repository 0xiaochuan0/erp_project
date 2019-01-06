package com.jk.service.commodity;

import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.utils.ResultPage;

import java.util.List;

public interface CommodityTypeSumUpService {
    ResultPage queryCommodityTypeSumUp(Integer page, Integer rows, CommodityTypeSumUpBean commodityTypeSumUp);

    boolean delsCommodityTypeSumUp(String ids);

    List<CommodityTypeSumUpBean> queryTypeOne();

    List<CommodityTypeSumUpBean> queryTypeTwo(Integer id);

    List<CommodityTypeSumUpBean> queryTypeThree(Integer id);

    List<CommodityTypeSumUpBean> queryTypeFour(Integer id);

    List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id);

    Boolean SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp);

}
