package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.TemporarySale;
import com.ykxj.zfine.model.TemporarySaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemporarySaleMapper {
    int countByExample(TemporarySaleExample example);

    int deleteByExample(TemporarySaleExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TemporarySale record);

    int insertSelective(TemporarySale record);

    List<TemporarySale> selectByExample(TemporarySaleExample example);

    TemporarySale selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TemporarySale record, @Param("example") TemporarySaleExample example);

    int updateByExample(@Param("record") TemporarySale record, @Param("example") TemporarySaleExample example);

    int updateByPrimaryKeySelective(TemporarySale record);

    int updateByPrimaryKey(TemporarySale record);
}