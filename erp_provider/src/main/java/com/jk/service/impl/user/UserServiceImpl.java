package com.jk.service.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.model.user.User;
import com.jk.mapper.user.UserMapper;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> queryUserList(Integer page, Integer rows) {
        Map<String, Object> map = new HashMap<>();
        map.put("start",(page - 1)*rows);
        map.put("end",page * rows);
        List<User> list = mapper.queryUserList(map);

        return list;
    }
}
