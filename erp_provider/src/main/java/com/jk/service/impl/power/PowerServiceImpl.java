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
    public ResultPage queryRolePage(RoleBean roleBean) {
        roleBean.calculate();
        ResultPage resultPage = new ResultPage();
        int powerCount = powerBeanMapper.queryRoleCount(roleBean);
        resultPage.setTotal(powerCount);
        List<RoleBean> roleList = powerBeanMapper.queryRoleList(roleBean);
        for (RoleBean role:roleList) {
            String[] split = role.getPowerName().split(",");
            if (split.length>4){
                String str = "";
                for (int i = 0; i < split.length; i++) {
                    str += str == ""? split[i] : "," + split[i];
                    if (i == 3){
                        break;
                    }
                }
                role.setText(str);
            }
        }
        resultPage.setRows(roleList);
        return resultPage;
    }

    @Override
    public void saveOrUpdateRole(RoleBean roleBean) {
        ArrayList<RolePowerBean> arrayList = new ArrayList<>();
        RolePowerBean rolePowerBean = null;
        String[] split = roleBean.getPowerName().split(",");
        if (StringUtils.isEmpty(roleBean.getId())){
            powerBeanMapper.saveRole(roleBean);
            System.out.println(roleBean.getId());
        } else {
            powerBeanMapper.updateRoleById(roleBean);
            powerBeanMapper.deleteRolePowerByRoleId(roleBean);
        }
        for (int i = 0; i < split.length; i++) {
            rolePowerBean = new RolePowerBean();
            rolePowerBean.setPowerId(Integer.parseInt(split[i]));
            rolePowerBean.setRoleId(roleBean.getId());
            arrayList.add(rolePowerBean);
        }
        powerBeanMapper.saveRolePower(arrayList);
    }

    @Override
    public RoleBean queryRoleInfoById(RoleBean roleBean) {
        return powerBeanMapper.queryRoleInfoById(roleBean);
    }

    @Override
    public List<PowerBean> queryPowerAll() {
        return powerBeanMapper.queryPowerAll();
    }
}
