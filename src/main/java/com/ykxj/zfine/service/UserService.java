package com.ykxj.zfine.service;


import com.ykxj.zfine.model.dto.LoginDTO;
import com.ykxj.zfine.model.mysql.User;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 14:48
 * @desc
 */
public interface UserService {

    User getUserByAccount(String account);

    int saveUser(User user);

    String login(LoginDTO loginDTO);
}
