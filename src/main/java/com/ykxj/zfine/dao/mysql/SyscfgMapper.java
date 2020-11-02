package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Syscfg;
import com.ykxj.zfine.model.SyscfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyscfgMapper {
    int countByExample(SyscfgExample example);

    int deleteByExample(SyscfgExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Syscfg record);

    int insertSelective(Syscfg record);

    List<Syscfg> selectByExample(SyscfgExample example);

    Syscfg selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Syscfg record, @Param("example") SyscfgExample example);

    int updateByExample(@Param("record") Syscfg record, @Param("example") SyscfgExample example);

    int updateByPrimaryKeySelective(Syscfg record);

    int updateByPrimaryKey(Syscfg record);
}