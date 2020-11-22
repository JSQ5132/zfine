package com.ykxj.zfine.service;

import com.ykxj.zfine.model.mysql.Menu;
import com.ykxj.zfine.model.mysql.Role;

import java.util.List;

/**
 * @Author JSQ
 * @Date 2020/11/22 15:33
 * @Version 1.0
 */
public interface RoleService {

    List<Role> listUserRoleByUserId(Long userId);

    List<Menu> listRoleMenuByRoleId(Long roleId);
}
