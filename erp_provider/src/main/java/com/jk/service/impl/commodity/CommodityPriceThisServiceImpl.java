package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityPriceThisMapper;
import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.service.commodity.CommodityPriceThisService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class CommodityPriceThisServiceImpl implements CommodityPriceThisService {
   @Autowired
    private CommodityPriceThisMapper commodityPriceThisMapper;


    public ResultPage queryCommodityPriceThis(Integer page, Integer rows, CommodityPriceThisBean commodityPriceThis){
        HashMap<String,Object> map=new HashMap<String,Object>();
        ResultPage ResultPage=new ResultPage();

        map.put("commodityPriceThis",commodityPriceThis);
        Integer count=commodityPriceThisMapper.queryCommodityPriceThisCount(map);
        ResultPage.setTotal(count);

        map.put("start",page*rows-rows);
        map.put("end",rows);
        List<CommodityTableBean> list=commodityPriceThisMapper.queryCommodityPriceThisList(map);
        ResultPage.setRows(list);
        return ResultPage;
    }

    @Override
    public List<Map<String, Object>> queryCommodity_priceThis_log(Integer id) {
        return commodityPriceThisMapper.queryCommodity_priceThis_log(id);
    }

    @Override
    public Boolean SaveOrUpdateCommodityPriceThis(CommodityPriceThisBean commodityPriceThis) {
        if(commodityPriceThis.getId()==null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String number = simpleDateFormat.format(new Date());
            number=number.replaceAll("[[\\s-:punct:]]","");
            commodityPriceThis.setNumber(number);
            commodityPriceThisMapper.SaveOrUpdateCommodityPriceThis(commodityPriceThis);
            return true;
        }else if(commodityPriceThis.getId()!=null){
            commodityPriceThisMapper.UpdateCommodityPriceThis(commodityPriceThis);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public CommodityPriceThisBean getCommodity_priceThis(Integer id) {
        return commodityPriceThisMapper.getCommodity_priceThis(id);
    }

}
