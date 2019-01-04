package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.PurchaseMapper;
import com.jk.model.purchase.Purchase;
import com.jk.service.purchase.IPurchaseService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service(version="1.0.0")
public class PurchaseServiceImpl implements IPurchaseService {

    @Autowired
    private PurchaseMapper mapper;



    @Override
    public ResultPage queryPurchase(Integer page, Integer rows, Purchase puerchaser) {
        ResultPage  pages=new ResultPage();
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("pages",page);
        params.put("rows",rows);
        params.put("puerchase",puerchaser);
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
    public Purchase huiPurchase(Integer id) {
        return mapper.huiPurchase(id);
    }
}
