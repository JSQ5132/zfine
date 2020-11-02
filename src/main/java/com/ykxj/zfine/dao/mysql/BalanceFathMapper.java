package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.BalanceFath;
import com.ykxj.zfine.model.BalanceFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceFathMapper {
    int countByExample(BalanceFathExample example);

    int deleteByExample(BalanceFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(BalanceFath record);

    int insertSelective(BalanceFath record);

    List<BalanceFath> selectByExample(BalanceFathExample example);

    BalanceFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") BalanceFath record, @Param("example") BalanceFathExample example);

    int updateByExample(@Param("record") BalanceFath record, @Param("example") BalanceFathExample example);

    int updateByPrimaryKeySelective(BalanceFath record);

    int updateByPrimaryKey(BalanceFath record);
}