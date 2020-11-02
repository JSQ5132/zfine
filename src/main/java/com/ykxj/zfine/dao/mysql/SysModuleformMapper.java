package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysModuleform;
import com.ykxj.zfine.model.SysModuleformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleformMapper {
    int countByExample(SysModuleformExample example);

    int deleteByExample(SysModuleformExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysModuleform record);

    int insertSelective(SysModuleform record);

    List<SysModuleform> selectByExampleWithBLOBs(SysModuleformExample example);

    List<SysModuleform> selectByExample(SysModuleformExample example);

    SysModuleform selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysModuleform record, @Param("example") SysModuleformExample example);

    int updateByExampleWithBLOBs(@Param("record") SysModuleform record, @Param("example") SysModuleformExample example);

    int updateByExample(@Param("record") SysModuleform record, @Param("example") SysModuleformExample example);

    int updateByPrimaryKeySelective(SysModuleform record);

    int updateByPrimaryKeyWithBLOBs(SysModuleform record);

    int updateByPrimaryKey(SysModuleform record);
}