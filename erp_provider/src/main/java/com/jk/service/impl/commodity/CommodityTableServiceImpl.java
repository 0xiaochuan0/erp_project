package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityTableMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.service.commodity.CommodityTableService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version="1.0.0")
public class CommodityTableServiceImpl implements  CommodityTableService{
    @Autowired
    private CommodityTableMapper commodityTableMapper;

    @Override
    public ResultPage queryCommodityTable(Integer page,Integer rows,CommodityTableBean commodityTableBean) {
        HashMap<String,Object> map=new HashMap<String,Object>();
        ResultPage ResultPage=new ResultPage();

        map.put("commodityTable",commodityTableBean);
        Integer count=commodityTableMapper.queryCommodityTableCount(map);
        ResultPage.setTotal(count);

        map.put("start",page*rows-rows);
        map.put("end",rows);
        List<CommodityTableBean> list=commodityTableMapper.queryCommodityTableList(map);
        ResultPage.setRows(list);
        return ResultPage;
    }

    @Override
    public boolean upState(CommodityTableBean commodityTableBean) {
        if(commodityTableBean.getId()==null){
            return false;
        }else if(commodityTableBean.getState()!=0){
            return false;
        }else if(0==commodityTableBean.getState()){
            commodityTableMapper.upState(commodityTableBean);
            return true;
        }
        return false;
    }


}
