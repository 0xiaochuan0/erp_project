package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.PurchaseMapper;
import com.jk.model.purchase.Credential;
import com.jk.model.purchase.Good;
import com.jk.model.purchase.Purchase;
import com.jk.service.purchase.IPurchaseService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service(version="1.0.0")
public class PurchaseServiceImpl implements IPurchaseService {

    @Autowired
    private PurchaseMapper mapper;



    @Override
    public ResultPage queryPurchase(Integer page, Integer rows, Purchase puerchaser,String  creatate) {
        ResultPage  pages=new ResultPage();
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("pages",page);
        params.put("rows",rows);
        params.put("puerchase",puerchaser);
        params.put("creatate",creatate);
        List<Purchase>  list=mapper.queryPurchase(params);
        Integer  count=mapper.countPurchase(params);
        pages.setRows(list);
        pages.setTotal(count);
        return  pages;
    }

    @Override
    public void addPurchase(Purchase purchase) {
        mapper.addPurchase(purchase);
    }

    @Override
    public Purchase huiPurchase(String supplierNumber) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("supplierNumber",supplierNumber);
        return mapper.huiPurchase(params);
    }

    @Override
    public void updatePurchase(Purchase purchase) {
        mapper.updatePurchase(purchase);
    }

    @Override
    public void addGood(String arr) {

        if(arr.contains("-")){
            String[] split = arr.split("-");

            for (int i = 0; i < split.length; i++) {
                Good good = new Good();
                String[] sp = split[i].split(",");
                    good.setSupplierNumber(sp[0]);
                    good.setGoodNum(sp[1]);
                    good.setGoodName(sp[2]);
                    good.setGoodSize(sp[3]);
                    good.setGoodUnit(sp[4]);
                mapper.addGood1(good);
            }

        }else{
            Good good = new Good();
            good.setSupplierNumber(arr);
            mapper.addGood1(good);
        }

    }

    @Override
    public List<Good> huiGood(String supplierNumber) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("supplierNumber",supplierNumber);
        return mapper.huiGood(params);
    }

    @Override
    public void addZheng(Credential credential) {
        mapper.addZheng(credential);
    }

    @Override
    public void updatStatus(String num, Integer status) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("num",num);
        params.put("status",status);
        mapper.updatStatus(params);
    }
}
