/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IndentServiceImpl
 * Author:   Divine
 * Date:     2019/1/1 16:48
 * Description: indentServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.indent;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.indent.IndentMapper;
import com.jk.model.indent.Indent;
import com.jk.service.indent.IIndentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈indentServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/1
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class IndentServiceImpl implements IIndentService {

    @Autowired
    public IndentMapper indentMapper;


    @Override
    public List<Map<String, Object>> queryYear() {
        return indentMapper.queryYear();
    }

    /*@Override
    public List<Map<String, Object>> queryFinance() {
        return indentMapper.queryFinance();
    }*/

   @Override
    public List<Map<String, Object>> queryFinance() {
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<>();
        List<Indent> indent = indentMapper.queryFinance();
       List<Long> list = new ArrayList<>();
        for (Indent inde :indent){
          list.add(inde.getMoney());
       }
       map.put("name","金额");
       map.put("data",list);
       mapList.add(map);
        return mapList;
    }
}
