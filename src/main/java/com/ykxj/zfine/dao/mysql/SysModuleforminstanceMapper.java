package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysModuleforminstance;
import com.ykxj.zfine.model.SysModuleforminstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleforminstanceMapper {
    int countByExample(SysModuleforminstanceExample example);

    int deleteByExample(SysModuleforminstanceExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysModuleforminstance record);

    int insertSelective(SysModuleforminstance record);

    List<SysModuleforminstance> selectByExampleWithBLOBs(SysModuleforminstanceExample example);

    List<SysModuleforminstance> selectByExample(SysModuleforminstanceExample example);

    SysModuleforminstance selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysModuleforminstance record, @Param("example") SysModuleforminstanceExample example);

    int updateByExampleWithBLOBs(@Param("record") SysModuleforminstance record, @Param("example") SysModuleforminstanceExample example);

    int updateByExample(@Param("record") SysModuleforminstance record, @Param("example") SysModuleforminstanceExample example);

    int updateByPrimaryKeySelective(SysModuleforminstance record);

    int updateByPrimaryKeyWithBLOBs(SysModuleforminstance record);

    int updateByPrimaryKey(SysModuleforminstance record);
}