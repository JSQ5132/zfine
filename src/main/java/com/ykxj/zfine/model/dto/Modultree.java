package com.ykxj.zfine.model.dto;

import com.ykxj.zfine.model.SysModule;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/2 17:01
 * @desc
 */
public class Modultree extends SysModule {

    private List<SysModule> menulist;

    public List<SysModule> getMenulist() {
        return menulist;
    }

    public void setMenulist(List<SysModule> menulist) {
        this.menulist = menulist;
    }
}
