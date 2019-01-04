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

    int queryPowerCount(@Param("powerBean") PowerBean powerBean);

    List<PowerBean> queryPowerList(@Param("powerBean") PowerBean powerBean);

    List<RoleBean> queryRoleAll();

    void savePower(PowerBean powerBean);

    void updatePowerById(@Param("powerBean") PowerBean powerBean);

    void deleteRolePowerByPowerId(@Param("powerBean") PowerBean powerBean);

    void saveRolePower(@Param("rolePowerBean") RolePowerBean rolePowerBean);

    PowerBean queryPowerInfoById(@Param("powerBean") PowerBean powerBean);
}