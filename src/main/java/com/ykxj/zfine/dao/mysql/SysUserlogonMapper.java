package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysUserlogon;
import com.ykxj.zfine.model.SysUserlogonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserlogonMapper {
    int countByExample(SysUserlogonExample example);

    int deleteByExample(SysUserlogonExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysUserlogon record);

    int insertSelective(SysUserlogon record);

    List<SysUserlogon> selectByExample(SysUserlogonExample example);

    SysUserlogon selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysUserlogon record, @Param("example") SysUserlogonExample example);

    int updateByExample(@Param("record") SysUserlogon record, @Param("example") SysUserlogonExample example);

    int updateByPrimaryKeySelective(SysUserlogon record);

    int updateByPrimaryKey(SysUserlogon record);
}