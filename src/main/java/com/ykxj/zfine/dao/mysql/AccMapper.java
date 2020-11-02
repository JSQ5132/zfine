package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Acc;
import com.ykxj.zfine.model.AccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccMapper {
    int countByExample(AccExample example);

    int deleteByExample(AccExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(Acc record);

    int insertSelective(Acc record);

    List<Acc> selectByExample(AccExample example);

    Acc selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") Acc record, @Param("example") AccExample example);

    int updateByExample(@Param("record") Acc record, @Param("example") AccExample example);

    int updateByPrimaryKeySelective(Acc record);

    int updateByPrimaryKey(Acc record);
}