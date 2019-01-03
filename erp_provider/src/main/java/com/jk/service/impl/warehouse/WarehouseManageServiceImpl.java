/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WarehouseManageServiceImpl
 * Author:   Divine
 * Date:     2019/1/2 18:34
 * Description: WarehouseManageServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.warehouse;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.warehouse.WarehouseManageMapper;
import com.jk.model.indents.Indents;
import com.jk.model.warehouse.WarehouseManage;
import com.jk.service.warehouse.IWarehouseManageService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈WarehouseManageServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/2
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class WarehouseManageServiceImpl implements IWarehouseManageService {

    @Autowired
    private WarehouseManageMapper warehouseManageMapper;

    @Override
    public ResultPage queryListStock(Integer page, Integer rows, WarehouseManage warehouseManage) {
        ResultPage resultPage = new ResultPage();
        Map<String,Object> map = new HashMap<String, Object>();
        if(page != null && rows != null){
            map.put("start",(page-1) * rows);
            map.put("end",rows);
        }else{
            map.put("start",0);
            map.put("end",3);
        }
        map.put("indents",warehouseManage);
        List<WarehouseManage> list = warehouseManageMapper.queryList(map);
        resultPage.setRows(list);
        resultPage.setTotal(warehouseManageMapper.queryCount(map));
        return resultPage;
    }

    @Override
    public void inStorage(Integer id) {
        warehouseManageMapper.inStorage(id);
    }
}
