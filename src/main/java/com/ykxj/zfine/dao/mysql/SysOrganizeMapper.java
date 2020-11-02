package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysOrganize;
import com.ykxj.zfine.model.SysOrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizeMapper {
    int countByExample(SysOrganizeExample example);

    int deleteByExample(SysOrganizeExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysOrganize record);

    int insertSelective(SysOrganize record);

    List<SysOrganize> selectByExample(SysOrganizeExample example);

    SysOrganize selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysOrganize record, @Param("example") SysOrganizeExample example);

    int updateByExample(@Param("record") SysOrganize record, @Param("example") SysOrganizeExample example);

    int updateByPrimaryKeySelective(SysOrganize record);

    int updateByPrimaryKey(SysOrganize record);
}