package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityPriceThisMapper;
import com.jk.mapper.commodity.CommodityTableMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.model.commodity.Commodity_priceThis_log;
import com.jk.service.commodity.CommodityTableService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Autowired
    private CommodityPriceThisMapper commodityPriceThisMapper;

    @Override
    public boolean SaveCommodityTableBean(CommodityTableBean commodityTableBean) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String number = simpleDateFormat.format(new Date());
        commodityTableBean.setTimeStart(number);
        number=number.replaceAll("[[\\s-:punct:]]","");

        if(commodityTableBean.getId()==null){
            commodityTableBean.setNumber(number);
            commodityTableMapper.SaveCommodityTableBean(commodityTableBean);
           /*Commodity_priceThis_log commodity_priceThis_logasd=new Commodity_priceThis_log();
                commodity_priceThis_logasd.setCommodity_priceThis_id(commodityTableBean.getSaveSId());
                commodity_priceThis_logasd.setTime(new Date().toString());
                commodity_priceThis_logasd.setPurchasingPrice(commodityTableBean.getPurchasingPrice());
                commodity_priceThis_logasd.setSellingPrice();
                commodityPriceThisMapper.SaveCommodity_priceThis_log(commodity_priceThis_logasd);*/
            return true;
        }else if(commodityTableBean.getId()!=null){

            commodityTableMapper.UpCommodityTableBean(commodityTableBean);
            return true;
        }
        return false;
    }

    @Override
    public CommodityTableBean getCommodityTableBean(Integer id) {
        return  commodityTableMapper.getCommodityTableBean(id);
    }

    @Override
    public List<CommodityTableBean> queryCommodityTrademar() {
        return commodityTableMapper.queryCommodityTrademar();
    }

    @Override
    public CommodityTypeBean queryTypeWhereId(Integer id) {
        return commodityTableMapper.queryTypeWhereId(id);
    }

    @Override
    public CommodityTypeSumUpBean queryTypeAttributeWhereid(Integer id) {
        return commodityTableMapper.queryTypeAttributeWhereid(id);
    }


}
