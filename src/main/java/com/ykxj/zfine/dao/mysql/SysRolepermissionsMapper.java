package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysRolepermissions;
import com.ykxj.zfine.model.SysRolepermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolepermissionsMapper {
    int countByExample(SysRolepermissionsExample example);

    int deleteByExample(SysRolepermissionsExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysRolepermissions record);

    int insertSelective(SysRolepermissions record);

    List<SysRolepermissions> selectByExample(SysRolepermissionsExample example);

    SysRolepermissions selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysRolepermissions record, @Param("example") SysRolepermissionsExample example);

    int updateByExample(@Param("record") SysRolepermissions record, @Param("example") SysRolepermissionsExample example);

    int updateByPrimaryKeySelective(SysRolepermissions record);

    int updateByPrimaryKey(SysRolepermissions record);
}