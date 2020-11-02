package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.RatechangeChi;
import com.ykxj.zfine.model.RatechangeChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RatechangeChiMapper {
    int countByExample(RatechangeChiExample example);

    int deleteByExample(RatechangeChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(RatechangeChi record);

    int insertSelective(RatechangeChi record);

    List<RatechangeChi> selectByExample(RatechangeChiExample example);

    RatechangeChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") RatechangeChi record, @Param("example") RatechangeChiExample example);

    int updateByExample(@Param("record") RatechangeChi record, @Param("example") RatechangeChiExample example);

    int updateByPrimaryKeySelective(RatechangeChi record);

    int updateByPrimaryKey(RatechangeChi record);
}