package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysMsg;
import com.ykxj.zfine.model.SysMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMsgMapper {
    int countByExample(SysMsgExample example);

    int deleteByExample(SysMsgExample example);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    List<SysMsg> selectByExample(SysMsgExample example);

    int updateByExampleSelective(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByExample(@Param("record") SysMsg record, @Param("example") SysMsgExample example);
}