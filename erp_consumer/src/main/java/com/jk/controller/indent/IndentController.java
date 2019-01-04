/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IndentController
 * Author:   Divine
 * Date:     2019/1/1 16:05
 * Description: indent
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.indent;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jk.service.indent.IIndentService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈indent〉
 *
 * @author Divine
 * @create 2019/1/1
 * @since 1.0.0
 */
@Controller
@RequestMapping("indent")
public class IndentController {

    @Reference(version = "1.0.0")
    private IIndentService indentService;

    @RequiresPermissions("indent:xiaoshou")
    @RequestMapping("toYear")
    public String toYear(){
        return "year";
    }

    @RequiresPermissions("indent:caiwu")
    @RequestMapping("toFinance")
    public String toFinance(){
        return "finance";
    }

    @RequestMapping("queryYear")
    @ResponseBody
    public List<Map<String,Object>> queryYear(){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

        try {
            List<Map<String,Object>> queryYear = indentService.queryYear();
            for (Map<String, Object> map2 : queryYear) {
                Map<String, Object> map3=new HashMap<String,Object>();
                map3.put("name",map2.get("年份"));
                map3.put("y", map2.get("销售数量"));
                map3.put("sliced", false);
                map3.put("selected", false);
                list.add(map3);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }

    @RequestMapping("queryFinance")
    @ResponseBody
    public List<Map<String,Object>> queryFinance(){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

        try {
            list = indentService.queryFinance();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return list;
    }
}
