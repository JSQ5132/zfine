package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysModulebutton;
import com.ykxj.zfine.model.SysModulebuttonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModulebuttonMapper {
    int countByExample(SysModulebuttonExample example);

    int deleteByExample(SysModulebuttonExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysModulebutton record);

    int insertSelective(SysModulebutton record);

    List<SysModulebutton> selectByExample(SysModulebuttonExample example);

    SysModulebutton selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysModulebutton record, @Param("example") SysModulebuttonExample example);

    int updateByExample(@Param("record") SysModulebutton record, @Param("example") SysModulebuttonExample example);

    int updateByPrimaryKeySelective(SysModulebutton record);

    int updateByPrimaryKey(SysModulebutton record);
}