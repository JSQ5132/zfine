package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Send;
import com.ykxj.zfine.model.SendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendMapper {
    int countByExample(SendExample example);

    int deleteByExample(SendExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Send record);

    int insertSelective(Send record);

    List<Send> selectByExample(SendExample example);

    Send selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Send record, @Param("example") SendExample example);

    int updateByExample(@Param("record") Send record, @Param("example") SendExample example);

    int updateByPrimaryKeySelective(Send record);

    int updateByPrimaryKey(Send record);
}