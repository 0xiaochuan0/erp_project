package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityPriceThisMapper;
import com.jk.model.commodity.CommodityPriceThisBean;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.Commodity_priceThis_log;
import com.jk.service.commodity.CommodityPriceThisService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

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
        List<Map<String, Object>> listMap=new ArrayList<Map<String,Object>>();

        List time1=new ArrayList();
       List time2=new ArrayList();

        Map<String, Object> map=new HashMap<String, Object>();
        List<Commodity_priceThis_log> Commodity_priceThis_logList=commodityPriceThisMapper.queryCommodity_priceThis_logGetSellingPrice(id);
        List<Integer> list1 =new ArrayList<Integer>();

        for (Commodity_priceThis_log list1ads:Commodity_priceThis_logList) {
            list1.add(Integer.parseInt(list1ads.getSellingPrice()));
            time1.add(list1ads.getTime()+"月份");
        }
        map.put("name","售价");
        map.put("data",list1);
        listMap.add(map);

        Map<String, Object> map2=new HashMap<String, Object>();
        List<Commodity_priceThis_log> Commodity_priceThis_logList2=commodityPriceThisMapper.queryCommodity_priceThis_logGetPricePurchasing(id);
        List<Integer> list2 =new ArrayList<Integer>();
        for (Commodity_priceThis_log list1ads:Commodity_priceThis_logList2) {
                list2.add(Integer.parseInt(list1ads.getPurchasingPrice()));
            time2.add(list1ads.getTime()+"月份");
        }

        map2.put("name","进价");
        map2.put("data",list2);

        listMap.add(map2);

        Map<String, Object> map3=new HashMap<String, Object>();
        map3.put("time",time1);
        listMap.add(map3);

        return listMap;
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

    @Override
    public Boolean SaveCommodity_priceThis_log(Commodity_priceThis_log commodity_priceThis_log) {
        if(commodity_priceThis_log!=null){
            commodityPriceThisMapper.SaveCommodity_priceThis_log(commodity_priceThis_log);
            return true;
        }
        return false;
    }

}
