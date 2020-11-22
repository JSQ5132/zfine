package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.dao.mysql.MenuButtonMapper;
import com.ykxj.zfine.model.mysql.MenuButton;
import com.ykxj.zfine.service.MenuButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JSQ
 * @Date 2020/11/22 16:13
 * @Version 1.0
 */
@Service("menuButtonService")
public class MenuButtonServiceImpl implements MenuButtonService {
    @Autowired
    private MenuButtonMapper menuButtonMapper;
    @Override
    public List<MenuButton> listMenuButtonByMenuId(Long menuId) {
        return menuButtonMapper.listMenuButtonByMenuId(menuId);
    }
}
