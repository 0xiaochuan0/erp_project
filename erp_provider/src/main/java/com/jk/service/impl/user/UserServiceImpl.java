package com.jk.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.user.UserBeanMapper;
import com.jk.model.ResultPage;
import com.jk.model.dept.DeptBean;
import com.jk.model.job.JobBean;
import com.jk.model.role.RoleBean;
import com.jk.model.user.UserBean;
import com.jk.model.userRole.UserRoleBean;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public ResultPage queryUserPage(UserBean userBean) {
        userBean.calculate();
        ResultPage resultPage = new ResultPage();
        int userCount = userBeanMapper.queryUserCount(userBean);
        resultPage.setTotal(userCount);
        List<UserBean> userList = userBeanMapper.queryUserList(userBean);
        resultPage.setRows(userList);
        return resultPage;
    }

    @Override
    public List<JobBean> queryJobAll() {
        return userBeanMapper.queryJobAll();
    }

    @Override
    public List<DeptBean> queryDeptAll() {
        return userBeanMapper.queryDeptAll();
    }

    @Override
    public List<JobBean> queryJobByDeptId(JobBean jobBean) {
        return userBeanMapper.queryJobByDeptId(jobBean);
    }

    @Override
    public void saveUser(UserBean userBean) {
        String[] split = userBean.getRoleName().split(",");
        userBean.setEntryTime(new Date());
        ArrayList<UserRoleBean> arrayList = new ArrayList<>();
        UserRoleBean userRoleBean = null;
        if (StringUtils.isEmpty(userBean.getId())){
            userBean.setPwd("admin");
            userBean.setStatus(1);
            userBeanMapper.saveUser(userBean);
        } else {
            userBeanMapper.updateUser(userBean);
            userBeanMapper.deleteUserRoleByUserId(userBean);
        }
        for (int i = 0; i < split.length; i++) {
            userRoleBean = new UserRoleBean();
            userRoleBean.setUserId(userBean.getId());
            userRoleBean.setRoleId(Integer.parseInt(split[i]));
            arrayList.add(userRoleBean);
        }
        userBeanMapper.saveUserRole(arrayList);
    }

    @Override
    public UserBean queryUserInfoById(UserBean userBean) {
        return userBeanMapper.queryUserInfoById(userBean);
    }

    @Override
    public UserBean queryUserInfoAndDeptNameByUserId(UserBean userInfo) {
        return userBeanMapper.queryUserInfoAndDeptNameByUserId(userInfo);
    }

    @Override
    public List<RoleBean> queryRoleAll() {
        return userBeanMapper.queryRoleAll();
    }
}
