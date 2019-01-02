package com.jk.service.indents;

import com.jk.model.indents.Indents;
import com.jk.utils.ResultPage;

import java.util.List;

/**
 * @program: erp_project
 * @description:
 * @author: 孙佳
 * @create: 2019-01-01 14:59
 **/
public interface IndentsService {

    ResultPage queryList(Integer page, Integer rows,Indents indents);

    List<Indents> showIndents();

    void insertMany(List<Indents> list);
}
