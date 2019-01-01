package com.jk.service.user;


import com.jk.model.user.UserBean;

import java.util.List;

public interface UserService {

    List<String> queryUserPowerByUserId(UserBean userBean);

    UserBean queryUserInfoByLoginNumber(String username);

    void updateUserPassword(UserBean userBean);
}
