package com.jk.service.user;

import java.util.List;

public interface UserService {

    List<User> queryUserList(Integer page, Integer rows);

    void saveMongo(User user);
}
