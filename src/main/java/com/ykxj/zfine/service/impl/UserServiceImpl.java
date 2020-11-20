package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.dao.mysql.UserMapper;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 15:15
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
    //12小时后失效
    private final static int EXPIRE = 12;
    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }


}
