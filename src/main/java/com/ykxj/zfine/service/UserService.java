package com.ykxj.zfine.service;

import com.ykxj.zfine.dao.mysql.UserMapper;
import com.ykxj.zfine.model.mysql.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 14:48
 * @desc
 */
public interface UserService {


    User getUserByAccountAndPassword();


}
