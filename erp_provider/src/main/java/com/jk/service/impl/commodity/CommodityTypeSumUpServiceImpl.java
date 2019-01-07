package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityTypeSumUpMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.service.commodity.CommodityTypeSumUpService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class CommodityTypeSumUpServiceImpl implements CommodityTypeSumUpService {
    @Autowired
    private CommodityTypeSumUpMapper commodityTypeSumUpMapper;
    @Override
    public ResultPage queryCommodityTypeSumUp(Integer page, Integer rows, CommodityTypeSumUpBean commodityTypeSumUp) {
        HashMap<String,Object> map=new HashMap<String,Object>();
        ResultPage ResultPage=new ResultPage();

        map.put("commodityTypeSumUp",commodityTypeSumUp);
        Integer count=commodityTypeSumUpMapper.queryCommodityTypeSumUpCount(map);

        ResultPage.setTotal(count);

        map.put("start",page*rows-rows);
        map.put("end",rows);
        List<CommodityTableBean> list=commodityTypeSumUpMapper.queryCommodityTypeSumUpList(map);
        ResultPage.setRows(list);
        return ResultPage;
    }

    @Override
    public boolean delsCommodityTypeSumUp(String ids) {
            if(ids!=null){
                commodityTypeSumUpMapper.delsCommodityTypeSumUp(ids);
                return true;
            }
        return false;
    }

    @Override
    public List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id) {
        return commodityTypeSumUpMapper.getCommodityTypeSumUp();
    }

    @Override
    public Boolean SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp , Integer[] type_valueArr) {


        if(commodityTypeSumUp.getId()==null){
            /*List<CommodityTypeSumUpBean>  CommodityTypeSumUpBeanList=new ArrayList<CommodityTypeSumUpBean>();
            for (int i = 0; i < type_valueArr.length; i++) {
                CommodityTypeSumUpBean commodityType=new CommodityTypeSumUpBean();
                    commodityType.setType_key(commodityTypeSumUp.getType_key());
                    commodityType.setType_value((type_valueArr[i]).toString());
                CommodityTypeSumUpBeanList.add(commodityType);
            }*/
            commodityTypeSumUpMapper.SaveOrUpdateCommodityTypeSumUp(commodityTypeSumUp);
            return true;
        }else if(commodityTypeSumUp.getId()!=null){
            commodityTypeSumUpMapper.UpdateCommodityTypeSumUp(commodityTypeSumUp);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<CommodityTypeBean> queryType(Integer id) {
        return commodityTypeSumUpMapper.queryType(id);
    }

    @Override
    public List<CommodityTypeBean> queryType_key() {
        return commodityTypeSumUpMapper.queryType_key();
    }

    @Override
    public List<CommodityTypeBean> queryType_value(CommodityTypeSumUpBean commodityTypeSumUp) {
        return commodityTypeSumUpMapper.queryType_value(commodityTypeSumUp);
    }
}
