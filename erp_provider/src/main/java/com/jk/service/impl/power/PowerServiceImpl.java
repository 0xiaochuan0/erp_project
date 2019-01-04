package com.jk.service.impl.power;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.power.PowerBeanMapper;
import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.model.rolePower.RolePowerBean;
import com.jk.service.power.PowerService;
import com.jk.utils.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0.0")
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerBeanMapper powerBeanMapper;

    @Override
    public ResultPage queryPowerPage(PowerBean powerBean) {
        powerBean.calculate();
        ResultPage resultPage = new ResultPage();
        int powerCount = powerBeanMapper.queryPowerCount(powerBean);
        resultPage.setTotal(powerCount);
        List<PowerBean> powerList = powerBeanMapper.queryPowerList(powerBean);
        resultPage.setRows(powerList);
        return resultPage;
    }

    @Override
    public List<RoleBean> queryRoleAll() {
        return powerBeanMapper.queryRoleAll();
    }

    @Override
    public void saveOrUpdatePower(PowerBean powerBean) {
        RolePowerBean rolePowerBean = new RolePowerBean();
        if (StringUtils.isEmpty(powerBean.getId())){
            powerBeanMapper.savePower(powerBean);
            System.out.println(powerBean.getId());
        } else {
            powerBeanMapper.updatePowerById(powerBean);
            powerBeanMapper.deleteRolePowerByPowerId(powerBean);
        }
        rolePowerBean.setPowerId(powerBean.getId());
        rolePowerBean.setRoleId(powerBean.getRoleId());
        powerBeanMapper.saveRolePower(rolePowerBean);
    }

    @Override
    public PowerBean queryPowerInfoById(PowerBean powerBean) {
        return powerBeanMapper.queryPowerInfoById(powerBean);
    }
}
