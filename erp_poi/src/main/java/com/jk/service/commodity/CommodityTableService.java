package com.jk.service.commodity;

import com.jk.model.commodity.CommodityTableBean;
import com.jk.utils.ResultPage;

public interface CommodityTableService {
    ResultPage queryCommodityTable(Integer page, Integer rows, CommodityTableBean commodityTableBean);

    boolean upState(CommodityTableBean commodityTableBean);

}
