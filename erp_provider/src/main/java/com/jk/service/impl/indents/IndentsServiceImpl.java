package com.jk.service.impl.indents;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.indents.IndentsMapper;
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
}
