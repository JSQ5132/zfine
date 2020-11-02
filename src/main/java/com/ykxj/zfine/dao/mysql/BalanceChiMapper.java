package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.BalanceChi;
import com.ykxj.zfine.model.BalanceChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceChiMapper {
    int countByExample(BalanceChiExample example);

    int deleteByExample(BalanceChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(BalanceChi record);

    int insertSelective(BalanceChi record);

    List<BalanceChi> selectByExample(BalanceChiExample example);

    BalanceChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") BalanceChi record, @Param("example") BalanceChiExample example);

    int updateByExample(@Param("record") BalanceChi record, @Param("example") BalanceChiExample example);

    int updateByPrimaryKeySelective(BalanceChi record);

    int updateByPrimaryKey(BalanceChi record);
}