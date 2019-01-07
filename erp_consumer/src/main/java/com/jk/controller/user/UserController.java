package com.jk.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.ResultPage;
import com.jk.model.dept.DeptBean;
import com.jk.model.job.JobBean;
import com.jk.model.role.RoleBean;
import com.jk.model.user.UserBean;
import com.jk.service.user.UserService;
import com.jk.util.UploadifyUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("uploadImg")
    public String uploadImg(MultipartFile imgFile, HttpServletRequest request) throws Exception {
        return UploadifyUtil.upload(imgFile,request);
    }

    @RequestMapping("updateUserPassword")
    public Boolean updateUserPassword(UserBean userBean){
        try {
            userService.updateUserPassword(userBean);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequiresPermissions("user:query")
    @RequestMapping("queryUserPage")
    public ResultPage queryUserPage(UserBean userBean){
        return userService.queryUserPage(userBean);
    }

    @RequestMapping("queryJobAll")
    public List<JobBean> queryJobAll(){

        return userService.queryJobAll();
    }

    @RequestMapping("queryDeptAll")
    public List<DeptBean> queryDeptAll(){
        return userService.queryDeptAll();
    }

    @RequestMapping("queryJobByDeptId")
    public List<JobBean> queryJobByDeptId(JobBean jobBean){
        return userService.queryJobByDeptId(jobBean);
    }

    @RequiresPermissions("user:save")
    @RequestMapping("saveUser")
    public Boolean saveUser(UserBean userBean){
        try {
            userService.saveUser(userBean);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequiresPermissions("user:edit")
    @RequestMapping("queryUserInfoById")
    public UserBean queryUserInfoById(UserBean userBean){
        return userService.queryUserInfoById(userBean);
    }

    @RequestMapping("getInfo")
    public UserBean getInfo(){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        return userInfo;
    }

    @RequestMapping("queryRoleAll")
    public List<RoleBean> queryRoleAll(){
        List<RoleBean> roleBeans = userService.queryRoleAll();
        return roleBeans;
    }
}
