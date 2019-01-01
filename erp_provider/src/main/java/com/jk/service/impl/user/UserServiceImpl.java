package com.jk.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.user.UserBeanMapper;
import com.jk.model.user.UserBean;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBeanMapper userBeanMapper;

    @Override
    public List<String> queryUserPowerByUserId(UserBean userBean) {
        return userBeanMapper.queryUserPowerByUserId(userBean);
    }

    @Override
    public UserBean queryUserInfoByLoginNumber(String username) {
        return userBeanMapper.queryUserInfoByLoginNumber(username);
    }

    @Override
    public void updateUserPassword(UserBean userBean) {
        userBeanMapper.updateUserPassword(userBean);
    }
}
