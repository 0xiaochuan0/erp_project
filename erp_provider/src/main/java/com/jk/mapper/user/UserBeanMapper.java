package com.jk.mapper.user;

import com.jk.model.user.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);

    UserBean queryUserInfoByLoginNumber(@Param("username") String username);

    List<String> queryUserPowerByUserId(@Param("userBean") UserBean userBean);

    void updateUserPassword(@Param("userBean") UserBean userBean);
}