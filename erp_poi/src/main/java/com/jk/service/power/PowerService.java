package com.jk.service.power;

import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.utils.ResultPage;

import java.util.List;

public interface PowerService {

    ResultPage queryPowerPage(PowerBean powerBean);

    List<RoleBean> queryRoleAll();

    void saveOrUpdatePower(PowerBean powerBean);

    PowerBean queryPowerInfoById(PowerBean powerBean);
}
