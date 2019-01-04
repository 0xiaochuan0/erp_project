package com.jk.service.user;


import com.jk.model.ResultPage;
import com.jk.model.dept.DeptBean;
import com.jk.model.job.JobBean;
import com.jk.model.user.UserBean;

import java.util.List;

public interface UserService {

    List<String> queryUserPowerByUserId(UserBean userBean);

    UserBean queryUserInfoByLoginNumber(String username);

    void updateUserPassword(UserBean userBean);

    ResultPage queryUserPage(UserBean userBean);

    List<JobBean> queryJobAll();

    List<DeptBean> queryDeptAll();

    List<JobBean> queryJobByDeptId(JobBean jobBean);

    void saveUser(UserBean userBean);

    UserBean queryUserInfoById(UserBean userBean);
}
