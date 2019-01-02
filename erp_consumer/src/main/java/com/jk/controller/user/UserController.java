package com.jk.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.user.UserBean;
import com.jk.service.user.UserService;
import com.jk.util.UploadifyUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("getInfo")
    public UserBean getInfo(){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        return userInfo;
    }
}
