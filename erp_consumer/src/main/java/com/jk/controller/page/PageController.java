package com.jk.controller.page;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchaseRequisition.PurchaseRequisitionBean;
import com.jk.model.user.UserBean;
import com.jk.service.purchaseRequisition.PurchaseRequisitionService;
import com.jk.service.user.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("page")
public class PageController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Reference(version = "1.0.0")
    private PurchaseRequisitionService purchaseRequisitionService;

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

    @RequiresPermissions("user:query")
    @RequestMapping("toUserPage")
    String toUserPage(){
        return "user/userPage";
    }

    @RequestMapping("toEditUser")
    String toEditUser(){
        return "user/editUser";
    }

    @RequiresPermissions("role:query")
    @RequestMapping("toPowerPage")
    String toPowerPage(ModelMap mm){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        mm.put("userInfo",userInfo);
        return "power/powerPage";
    }

    @RequestMapping("toEditPower")
    String toEditPower(){
        return "power/editPower";
    }

    @RequiresPermissions("requestPurchase:query")
    @RequestMapping("toPurchaseRequisitionPage")
    String toPurchaseRequisitionPage(ModelMap mm){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        mm.put("userName",userInfo.getName());
        return "purchaseRequisition/purchaseRequisitionPage";
    }

    @RequiresPermissions("requestPurchase:save")
    @RequestMapping("toEditPurchaseRequisition")
    String toEditPurchaseRequisition(PurchaseRequisitionBean purchaseRequisitionBean, ModelMap mm){
        UserBean userInfo = (UserBean) SecurityUtils.getSubject().getPrincipal();
        UserBean user = userService.queryUserInfoAndDeptNameByUserId(userInfo);
        if (!purchaseRequisitionBean.getPurchaseRequisitionIdentifier().equals("-1")){
            System.out.println(purchaseRequisitionBean.getId());
            PurchaseRequisitionBean info = purchaseRequisitionService.queryPurchaseRequisitionInfoByPurchaseRequisitionIdentifier(purchaseRequisitionBean);
            mm.put("info",info);
            mm.put("userBean",user);
            return "purchaseRequisition/editPurchaseRequisitions";
        }
        mm.put("userBean",user);
        return "purchaseRequisition/editPurchaseRequisition";
    }

    @RequestMapping("toSelectCommodity")
    String toSelectCommodity(){
        return "purchaseRequisition/selectCommodity";
    }

    @RequiresPermissions("requestPurchase:auditing")
    @RequestMapping("toAuditingPurchaseRequisition")
    String toAuditingPurchaseRequisition(){
        return "purchaseRequisition/auditingPurchaseRequisition";
    }

    @RequestMapping("toAssign")
    String toAssign(){
        return "purchaseRequisition/assign";
    }
}
