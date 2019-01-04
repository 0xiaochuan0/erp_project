package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.CommodityTypeSumUpMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.commodity.CommodityTypeSumUpBean;
import com.jk.service.commodity.CommodityTypeSumUpService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

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
    public List<CommodityTypeSumUpBean> queryTypeOne() {
        return commodityTypeSumUpMapper.queryTypeOne();
    }

    @Override
    public List<CommodityTypeSumUpBean> queryTypeTwo(Integer id) {
        return commodityTypeSumUpMapper.queryTypeTwo(id);
    }

    @Override
    public List<CommodityTypeSumUpBean> queryTypeThree(Integer id) {
        return commodityTypeSumUpMapper.queryTypeThree(id);
    }

    @Override
    public List<CommodityTypeSumUpBean> queryTypeFour(Integer id) {
        return commodityTypeSumUpMapper.queryTypeFour(id);
    }

    @Override
    public List<CommodityTypeSumUpBean> getCommodityTypeSumUp(Integer id) {
        return commodityTypeSumUpMapper.getCommodityTypeSumUp();
    }

    @Override
    public Boolean SaveOrUpdateCommodityTypeSumUp(CommodityTypeSumUpBean commodityTypeSumUp) {
        if(commodityTypeSumUp.getId()==null){
            commodityTypeSumUpMapper.SaveOrUpdateCommodityTypeSumUp(commodityTypeSumUp);
            return true;
        }else if(commodityTypeSumUp.getId()!=null){
            commodityTypeSumUpMapper.UpdateCommodityTypeSumUp(commodityTypeSumUp);
            return true;
        }else{
            return false;
        }
    }
}
