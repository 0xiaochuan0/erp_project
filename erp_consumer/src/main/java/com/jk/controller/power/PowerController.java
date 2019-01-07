package com.jk.controller.power;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.service.power.PowerService;
import com.jk.utils.ResultPage;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("power")
public class PowerController {

    @Reference(version = "1.0.0")
    private PowerService powerService;

    @RequiresPermissions("role:query")
    @RequestMapping("queryRolePage")
    public ResultPage queryRolePage(RoleBean roleBean){
        return powerService.queryRolePage(roleBean);
    }

    @RequiresPermissions("role:save")
    @RequestMapping("saveOrUpdateRole")
    public Boolean saveOrUpdateRole(RoleBean roleBean){
        try {
            powerService.saveOrUpdateRole(roleBean);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequiresPermissions("role:edit")
    @RequestMapping("queryRoleInfoById")
    public RoleBean queryRoleInfoById(RoleBean roleBean){
        RoleBean info = powerService.queryRoleInfoById(roleBean);
        System.out.println(info);
        return info;
    }

    @RequestMapping("queryPowerAll")
    public List<PowerBean> queryPowerAll(){
        return powerService.queryPowerAll();
    }
}
