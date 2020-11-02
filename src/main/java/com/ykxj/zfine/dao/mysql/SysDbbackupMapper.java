package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysDbbackup;
import com.ykxj.zfine.model.SysDbbackupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDbbackupMapper {
    int countByExample(SysDbbackupExample example);

    int deleteByExample(SysDbbackupExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysDbbackup record);

    int insertSelective(SysDbbackup record);

    List<SysDbbackup> selectByExample(SysDbbackupExample example);

    SysDbbackup selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysDbbackup record, @Param("example") SysDbbackupExample example);

    int updateByExample(@Param("record") SysDbbackup record, @Param("example") SysDbbackupExample example);

    int updateByPrimaryKeySelective(SysDbbackup record);

    int updateByPrimaryKey(SysDbbackup record);
}