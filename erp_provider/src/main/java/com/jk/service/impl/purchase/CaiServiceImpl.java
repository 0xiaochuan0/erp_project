package com.jk.service.impl.purchase;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.purchase.CaiMapper;
import com.jk.mapper.purchase.PurchaserequisitionMapper;
import com.jk.mapper.warehouse.WarehouseManageMapper;
import com.jk.model.commodity.CommodityTableBean;
import com.jk.model.purchase.Cai;
import com.jk.model.purchase.Purchase;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.service.purchase.ICaiService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(version="1.0.0")
public class CaiServiceImpl implements ICaiService {
    @Autowired
    private CaiMapper  mapper;

    @Autowired
    private PurchaserequisitionMapper   purchaserequisitionMapper;



    @Override
    public ResultPage showCai(Integer page, Integer rows, Cai cai,String creatda) {
        ResultPage  pages=new ResultPage();
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("pages",page);
        params.put("rows",rows);
        params.put("cai",cai);
        params.put("creatda",creatda);
        List<Cai> list=mapper.showCai(params);
        Integer  count=mapper.countCai(params);
        pages.setRows(list);
        pages.setTotal(count);
        return  pages;
    }

    @Override
    public List<PurchaseRequisitionBean> selectType() {
        return mapper.selectType();
    }

    @Override
    public ResultPage queryGood(Integer page, Integer rows, String qingNum) {
        ResultPage  pages=new ResultPage();
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("pages",page);
        params.put("rows",rows);
        params.put("qingNum",qingNum);
        List<CommodityTableBean> list=purchaserequisitionMapper.queryGood(params);
        Integer  count=purchaserequisitionMapper.countGood(params);
        pages.setRows(list);
        pages.setTotal(count);
        return  pages;

    }

    @Override
    public void addCai(String obj) throws ParseException {
        String[] split = obj.split("=");
        SimpleDateFormat  sdf= new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i <split.length ; i++) {
            String[] sp = split[i].split(",");
            Cai cai = new Cai();
           cai.setShangnum(sp[0]);
           cai.setCaigoushu(Integer.parseInt(sp[1]));
           cai.setCreatDate(sdf.parse(sp[2]));
           cai.setDuiYingQingGouNum(sp[3]);
           cai.setGongYingShangNum(sp[4]);
           cai.setGongYingShangName(sp[5]);
           cai.setAdress(sp[6]);
           cai.setOrderNum(sp[7]);
           cai.setEditperson(sp[8]);
           cai.setDept(Integer.parseInt(sp[9]));
           cai.setBeizhu(sp[10]);
            mapper.addCai(cai);


        }

    }

    @Override
    public void updatStatus(String num, Integer id, Integer status) {
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("orderId",id);
        params.put("status",status);
        mapper.updatStatus(params);

    }
}
