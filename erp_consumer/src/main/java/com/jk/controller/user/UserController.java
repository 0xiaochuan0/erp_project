package com.jk.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.user.User;
import com.jk.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("toYear")
    public String toYear(){

        return "year";
    }
    @RequestMapping("queryList")
    public List<User> queryUserList(Integer page, Integer rows){
        List<User> list = userService.queryUserList(page, rows);
        return list;
    }

}
