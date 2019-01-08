/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShelfPlaceServiceImpl
 * Author:   Divine
 * Date:     2019/1/4 20:29
 * Description: ShelfPlaceServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl.warehouse;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.warehouse.ShelfPlaceMapper;
import com.jk.model.warehouse.ShelfPlace;
import com.jk.service.warehouse.IShelfPlaceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ShelfPlaceServiceImpl〉
 *
 * @author Divine
 * @create 2019/1/4
 * @since 1.0.0
 */
@Service(version = "1.0.0")
public class ShelfPlaceServiceImpl implements IShelfPlaceService {

    @Autowired
    private ShelfPlaceMapper shelfPlaceMapper;


    @Override
    public List<ShelfPlace> queryManagement(ShelfPlace shelfPlace) {
        return shelfPlaceMapper.queryManagement(shelfPlace);
    }

    @Override
    public List<ShelfPlace> queryReport(ShelfPlace shelfPlace) {
        return shelfPlaceMapper.queryReport(shelfPlace);
    }
}
