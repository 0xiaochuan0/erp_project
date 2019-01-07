package com.jk.mapper.power;

import com.jk.model.power.PowerBean;
import com.jk.model.role.RoleBean;
import com.jk.model.rolePower.RolePowerBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface PowerBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PowerBean record);

    int insertSelective(PowerBean record);

    PowerBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PowerBean record);

    int updateByPrimaryKey(PowerBean record);

    int queryRoleCount(RoleBean roleBean);

    List<RoleBean> queryRoleList(RoleBean roleBean);

    void saveRole(RoleBean roleBean);

    void updateRoleById(RoleBean roleBean);

    void deleteRolePowerByRoleId(RoleBean roleBean);

    void saveRolePower(@Param("arrayList") List<RolePowerBean> arrayList);

    RoleBean queryRoleInfoById(RoleBean roleBean);

    List<PowerBean> queryPowerAll();
}