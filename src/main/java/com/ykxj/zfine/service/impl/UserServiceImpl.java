package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.config.shiro.TokenGenerator;
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

    @Override
    /**
     * 生成一个token
     *@param  [userId]
     *@return Result
     */
    public Map<String, Object> createToken(String userId) {
        Map<String, Object> result = new HashMap<>();
        //生成一个token
        String token = TokenGenerator.generateValue();
        //当前时间
        LocalDateTime now = LocalDateTime.now();
        //过期时间
        LocalDateTime expireTime = now.plusHours(EXPIRE);
        //判断是否生成过token
//        SysToken tokenEntity = sysTokenRepository.findByUserId(userId);
//        if (tokenEntity == null) {
//            tokenEntity = new SysToken();
//            tokenEntity.setUserId(userId);
//            //保存token
//            tokenEntity.setToken(token);
//            tokenEntity.setUpdateTime(now);
//            tokenEntity.setExpireTime(expireTime);
//        } else {
//            //更新token
//            tokenEntity.setToken(token);
//            tokenEntity.setUpdateTime(now);
//            tokenEntity.setExpireTime(expireTime);
//        }
//        sysTokenRepository.save(tokenEntity);
        result.put("token", token);
        result.put("expire", expireTime);
        return result;
    }
}
