package com.ykxj.zfine.service;

import com.ykxj.zfine.model.mysql.MenuButton;

import java.util.List;

/**
 * @Author JSQ
 * @Date 2020/11/22 16:10
 * @Version 1.0
 */
public interface MenuButtonService {

    List<MenuButton> listMenuButtonByMenuId(Long menuId);
}
