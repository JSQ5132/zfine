package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysRoleauthorize;
import com.ykxj.zfine.model.SysRoleauthorizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleauthorizeMapper {
    int countByExample(SysRoleauthorizeExample example);

    int deleteByExample(SysRoleauthorizeExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysRoleauthorize record);

    int insertSelective(SysRoleauthorize record);

    List<SysRoleauthorize> selectByExample(SysRoleauthorizeExample example);

    SysRoleauthorize selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysRoleauthorize record, @Param("example") SysRoleauthorizeExample example);

    int updateByExample(@Param("record") SysRoleauthorize record, @Param("example") SysRoleauthorizeExample example);

    int updateByPrimaryKeySelective(SysRoleauthorize record);

    int updateByPrimaryKey(SysRoleauthorize record);
}