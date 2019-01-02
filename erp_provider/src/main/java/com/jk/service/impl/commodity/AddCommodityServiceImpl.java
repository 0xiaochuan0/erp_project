package com.jk.service.impl.commodity;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.commodity.AddCommodityMapper;
import com.jk.service.commodity.AddCommodityService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class AddCommodityServiceImpl implements AddCommodityService {

    @Autowired
    private AddCommodityMapper addCommodityMapper;
}
