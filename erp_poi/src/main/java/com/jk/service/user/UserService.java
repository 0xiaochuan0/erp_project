package com.jk.service.user;

import com.jk.model.user.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList(Integer page, Integer rows);

}
