package com.ykxj.zfine.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.ykxj.zfine.common.api.CommonResult;
import com.ykxj.zfine.common.utils.EndecryptUtils;
import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.dao.mysql.UserMapper;
import com.ykxj.zfine.model.dto.LoginDTO;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
        if (user == null || EndecryptUtils.checkMd5Password(user.getAccount(), loginDTO.getPassword(), user.getSalt(), user.getPassword()) ==false) {
            return "账号或密码有误";
        } else {
            String token = JWTUtils.sign(user.getAccount(), user.getPassword());
            return token;
        }
    }

    @Override
    public String register(User user) {
        User user1 = userMapper.getUserByAccount(user.getAccount());
        if (user1 == null) {
            //如果数据库没有新增用户的账号信息，可以新增
            User usertemp = EndecryptUtils.md5Password(user.getAccount(), user.getPassword());
            user.setCreateTime(new Date());
            user.setPassword(usertemp.getPassword());
            user.setSalt(usertemp.getSalt());
            userMapper.insert(user);
            return "用户注册成功";
        } else {
            return "用户已存在，保存失败";
        }
    }

    @Override
    public CommonResult refreshToken(String oldToken) {
        String username = JWTUtils.getUsername(oldToken);
        if (StrUtil.isEmpty(username)){
            return CommonResult.failed("当前token无效！");
        }
        User user = userMapper.getUserByAccount(username);
        if (ObjectUtil.isNull(user)) {
            return CommonResult.failed("用户不存在！");
        }
        // 校验token是否超时失效 & 或者账号密码是否错误
        if (! JWTUtils.verify(oldToken, username, user.getPassword())) {
            return CommonResult.failed("token 已过期请重新登录!！");
        }
        String token = JWTUtils.sign(user.getAccount(), user.getPassword());
        return CommonResult.success(token,"刷新token成功！");
    }


}
