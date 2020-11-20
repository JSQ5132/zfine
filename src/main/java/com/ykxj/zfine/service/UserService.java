package com.ykxj.zfine.service;


import com.ykxj.zfine.model.mysql.User;

import java.util.Map;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 14:48
 * @desc
 */
public interface UserService {

    User getUserByAccount(String account);

}
