package com.jk.mapper.commodity;

import com.jk.model.commodity.CommodityTableBean;

import java.util.HashMap;
import java.util.List;

public interface CommodityTableMapper {

    Integer queryCommodityTableCount(HashMap<String,Object> map);

    List<CommodityTableBean> queryCommodityTableList(HashMap<String, Object> map);

    void upState(CommodityTableBean commodityTableBean);

}
