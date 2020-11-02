package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.RecedChi;
import com.ykxj.zfine.model.RecedChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecedChiMapper {
    int countByExample(RecedChiExample example);

    int deleteByExample(RecedChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(RecedChi record);

    int insertSelective(RecedChi record);

    List<RecedChi> selectByExample(RecedChiExample example);

    RecedChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") RecedChi record, @Param("example") RecedChiExample example);

    int updateByExample(@Param("record") RecedChi record, @Param("example") RecedChiExample example);

    int updateByPrimaryKeySelective(RecedChi record);

    int updateByPrimaryKey(RecedChi record);
}