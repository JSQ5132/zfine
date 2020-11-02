package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysCompanyrole;
import com.ykxj.zfine.model.SysCompanyroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCompanyroleMapper {
    int countByExample(SysCompanyroleExample example);

    int deleteByExample(SysCompanyroleExample example);

    int deleteByPrimaryKey(@Param("fUserid") String fUserid, @Param("fRoleid") String fRoleid);

    int insert(SysCompanyrole record);

    int insertSelective(SysCompanyrole record);

    List<SysCompanyrole> selectByExample(SysCompanyroleExample example);

    SysCompanyrole selectByPrimaryKey(@Param("fUserid") String fUserid, @Param("fRoleid") String fRoleid);

    int updateByExampleSelective(@Param("record") SysCompanyrole record, @Param("example") SysCompanyroleExample example);

    int updateByExample(@Param("record") SysCompanyrole record, @Param("example") SysCompanyroleExample example);

    int updateByPrimaryKeySelective(SysCompanyrole record);

    int updateByPrimaryKey(SysCompanyrole record);
}