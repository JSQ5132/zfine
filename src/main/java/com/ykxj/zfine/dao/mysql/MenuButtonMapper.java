package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.mysql.MenuButton;
import com.ykxj.zfine.model.mysql.MenuButtonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuButtonMapper {
    int countByExample(MenuButtonExample example);

    int deleteByExample(MenuButtonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MenuButton record);

    int insertSelective(MenuButton record);

    List<MenuButton> selectByExample(MenuButtonExample example);

    MenuButton selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MenuButton record, @Param("example") MenuButtonExample example);

    int updateByExample(@Param("record") MenuButton record, @Param("example") MenuButtonExample example);

    int updateByPrimaryKeySelective(MenuButton record);

    int updateByPrimaryKey(MenuButton record);

    List<MenuButton> listMenuButtonByMenuId(Long menuId);
}