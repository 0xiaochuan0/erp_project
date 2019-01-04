package com.jk.controller.power;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.service.power.PowerService;
import com.jk.utils.ResultPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("power")
public class PowerController {

    @Reference(version = "1.0.0")
    private PowerService powerService;

    @RequestMapping("queryPowerPage")
    public ResultPage queryPowerPage(PowerBean powerBean){
        return powerService.queryPowerPage(powerBean);
    }

    @RequestMapping("queryRoleAll")
    public List<RoleBean> queryRoleAll(){
        return powerService.queryRoleAll();
    }

    @RequestMapping("saveOrUpdatePower")
    public Boolean saveOrUpdatePower(PowerBean powerBean){
        try {
            powerService.saveOrUpdatePower(powerBean);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequestMapping("queryPowerInfoById")
    public PowerBean queryPowerInfoById(PowerBean powerBean){
        PowerBean info = powerService.queryPowerInfoById(powerBean);
        System.out.println(info);
        return info;
    }
}
