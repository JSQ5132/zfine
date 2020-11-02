package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysItems;
import com.ykxj.zfine.model.SysItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysItemsMapper {
    int countByExample(SysItemsExample example);

    int deleteByExample(SysItemsExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysItems record);

    int insertSelective(SysItems record);

    List<SysItems> selectByExample(SysItemsExample example);

    SysItems selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysItems record, @Param("example") SysItemsExample example);

    int updateByExample(@Param("record") SysItems record, @Param("example") SysItemsExample example);

    int updateByPrimaryKeySelective(SysItems record);

    int updateByPrimaryKey(SysItems record);
}