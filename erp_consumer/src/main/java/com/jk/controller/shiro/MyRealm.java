package com.jk.controller.shiro;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.user.UserBean;
import com.jk.service.user.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyRealm extends AuthorizingRealm {

    @Reference(version = "1.0.0")
    private UserService userService;
    /**
     * 授权器
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserBean userBean = (UserBean) principals.getPrimaryPrincipal();
        List<String> list = userService.queryUserPowerByUserId(userBean);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(list);
        return info;
    }

    /**
     * 认证器
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        UserBean userBean = userService.queryUserInfoByLoginNumber(username);
        if (!username.equals(userBean.getAccount())){
            throw new UnknownAccountException();
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userBean,userBean.getPwd(),this.getName());
        return info;
    }
}
