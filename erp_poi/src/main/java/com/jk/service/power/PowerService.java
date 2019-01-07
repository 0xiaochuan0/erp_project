package com.jk.service.power;

import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.utils.ResultPage;

import java.util.List;

public interface PowerService {

    ResultPage queryRolePage(RoleBean roleBean);

    void saveOrUpdateRole(RoleBean roleBean);

    RoleBean queryRoleInfoById(RoleBean roleBean);

    List<PowerBean> queryPowerAll();
}
