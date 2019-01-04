package com.jk.controller.page;

import com.jk.model.user.UserBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("toLogin")
    String toLogin(){
        return "user/login";
    }

    @RequestMapping("login")
    String login(HttpServletRequest request, Model model){
        String attribute = (String) request.getAttribute("shiroLoginFailure");
        if (UnknownAccountException.class.getName().equals(attribute) || AuthenticationException.class.getName().equals(attribute)){
            model.addAttribute("info","账号不存在！！！");
            System.out.println("账号不存在！！！");
        } else if (IncorrectCredentialsException.class.getName().equals(attribute)){
            model.addAttribute("info","密码错误！！！");
            System.out.println("密码错误！！！");
        }
        return "user/login";
    }

    @RequestMapping("toError")
    String toError(){
        return "user/error";
    }

    @RequestMapping("toPersonalInfo")
    String toPersonalInfo(ModelMap mm){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        System.out.println(userInfo);
        mm.put("user",userInfo);
        return "user/personalInfo";
    }

    @RequestMapping("toUserPage")
    String toUserPage(){
        return "user/userPage";
    }

    @RequestMapping("toEditUser")
    String toEditUser(){
        return "user/editUser";
    }

    @RequestMapping("toPowerPage")
    String toPowerPage(){
        return "power/powerPage";
    }

    @RequestMapping("toEditPower")
    String toEditPower(){
        return "power/editPower";
    }
}
