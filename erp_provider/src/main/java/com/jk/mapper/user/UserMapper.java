package com.jk.mapper.user;

import com.jk.model.user.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //
    List<User> queryUserList(Map<String, Object> map);
}
