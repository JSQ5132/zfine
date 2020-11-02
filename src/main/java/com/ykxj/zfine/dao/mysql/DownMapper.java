package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Down;
import com.ykxj.zfine.model.DownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownMapper {
    int countByExample(DownExample example);

    int deleteByExample(DownExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(Down record);

    int insertSelective(Down record);

    List<Down> selectByExample(DownExample example);

    Down selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") Down record, @Param("example") DownExample example);

    int updateByExample(@Param("record") Down record, @Param("example") DownExample example);

    int updateByPrimaryKeySelective(Down record);

    int updateByPrimaryKey(Down record);
}