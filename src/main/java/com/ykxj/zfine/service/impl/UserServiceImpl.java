package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.common.api.CommonResult;
import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.dao.mysql.UserMapper;
import com.ykxj.zfine.model.dto.LoginDTO;
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
    //12小时后失效
    private final static int EXPIRE = 12;
    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }

    @Override
    public int saveUser(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public String login(LoginDTO loginDTO) {
        String password = loginDTO.getPassword();

        //根据登录账号查找用户信息
        User user = userMapper.getUserByAccount(loginDTO.getAccount());
        //账号不存在
        if (user == null || !user.getPassword().equals(password)) {
            return "账号或密码有误";
        } else {
            String token = JWTUtils.sign(loginDTO.getAccount(), password);
            return token;
        }
    }


}
