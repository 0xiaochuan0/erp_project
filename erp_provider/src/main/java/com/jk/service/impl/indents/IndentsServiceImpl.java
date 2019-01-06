package com.jk.service.impl.indents;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.indents.IndentsMapper;
import com.jk.model.indents.Goods;
import com.jk.model.indents.Indents;
import com.jk.service.indents.IndentsService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: erp_project
 * @description:
 * @author: 孙佳
 * @create: 2019-01-01 15:00
 **/
@Service(version = "1.0.0")
public class IndentsServiceImpl implements IndentsService {
    @Autowired
    private IndentsMapper indentsMapper;


    @Override
    public ResultPage queryList(Integer page, Integer rows, Indents indents) {
        ResultPage resultPage = new ResultPage();
        Map<String,Object> map = new HashMap<String, Object>();
        if(page != null && rows != null){
            map.put("start",(page-1) * rows);
            map.put("end",rows);
        }else{
            map.put("start",0);
            map.put("end",3);
        }
        map.put("indents",indents);
        List<Indents> list = indentsMapper.queryList(map);
        resultPage.setRows(list);
        resultPage.setTotal(indentsMapper.queryCount(map));
        return resultPage;
    }

    @Override
    public List<Indents> showIndents() {
        return indentsMapper.showIndents();
    }

    @Override
    public void insertMany(List<Indents> list) {
        indentsMapper.insertMany(list);
    }

    @Override
    public void delIndentsByIds(Integer[] ids) {
        indentsMapper.delIndentsByIds(ids);
    }

    @Override
    public Goods queryGoodsByName(String name) {
        return indentsMapper.queryGoodsByName(name);
    }

    @Override
    public void updateIndentsPayStatus(Integer[] ids) {
        indentsMapper.updateIndentsPayStatus(ids);
    }

    @Override
    public void updateIndentsToConfirm(Integer[] ids) {
        indentsMapper.updateIndentsToConfirm(ids);
    }

    @Override
    public List<Map<String, Object>> queryCountByDay() {
        return indentsMapper.queryCountByDay();
    }

    @Override
    public List<Map<String, Object>> queryCountByName() {
        return indentsMapper.queryCountByName();
    }

    @Override
    public ResultPage queryConfirm(Integer page, Integer rows, Indents indents) {
        ResultPage resultPage = new ResultPage();
        Map<String,Object> map = new HashMap<String, Object>();
        if(page != null && rows != null){
            map.put("start",(page-1) * rows);
            map.put("end",rows);
        }else{
            map.put("start",0);
            map.put("end",3);
        }
        map.put("indents",indents);
        List<Indents> list = indentsMapper.queryConfirm(map);
        resultPage.setRows(list);
        resultPage.setTotal(indentsMapper.queryCountConfirm(map));
        return resultPage;
    }

    @Override
    public ResultPage queryReturn(Integer page, Integer rows, Indents indents) {
        ResultPage resultPage = new ResultPage();
        Map<String,Object> map = new HashMap<String, Object>();
        if(page != null && rows != null){
            map.put("start",(page-1) * rows);
            map.put("end",rows);
        }else{
            map.put("start",0);
            map.put("end",3);
        }
        map.put("indents",indents);
        List<Indents> list = indentsMapper.queryReturn(map);
        resultPage.setRows(list);
        resultPage.setTotal(indentsMapper.queryCountReturn(map));
        return resultPage;
    }

}
