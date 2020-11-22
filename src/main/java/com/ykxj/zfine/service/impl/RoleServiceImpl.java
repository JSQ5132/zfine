package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.dao.mysql.MenuMapper;
import com.ykxj.zfine.dao.mysql.RoleMapper;
import com.ykxj.zfine.model.mysql.Menu;
import com.ykxj.zfine.model.mysql.Role;
import com.ykxj.zfine.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JSQ
 * @Date 2020/11/22 15:36
 * @Version 1.0
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private  RoleMapper roleMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Role> listUserRoleByUserId(Long userId) {
        return roleMapper.listUserRoleByUserId(userId);
    }

    @Override
    public List<Menu> listRoleMenuByRoleId(Long roleId) {
        return menuMapper.listMenuByRoleId(roleId);
    }
}
