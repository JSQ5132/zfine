package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysFilterip;
import com.ykxj.zfine.model.SysFilteripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFilteripMapper {
    int countByExample(SysFilteripExample example);

    int deleteByExample(SysFilteripExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysFilterip record);

    int insertSelective(SysFilterip record);

    List<SysFilterip> selectByExample(SysFilteripExample example);

    SysFilterip selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysFilterip record, @Param("example") SysFilteripExample example);

    int updateByExample(@Param("record") SysFilterip record, @Param("example") SysFilteripExample example);

    int updateByPrimaryKeySelective(SysFilterip record);

    int updateByPrimaryKey(SysFilterip record);
}