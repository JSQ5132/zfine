package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.dao.mysql.UserMapper;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 15:15
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByAccountAndPassword() {
        return null;
    }
}
