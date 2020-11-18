package com.ykxj.zfine.dao.clickhouse;

import com.ykxj.zfine.model.clickhouse.Uact;
import com.ykxj.zfine.model.clickhouse.UactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UactMapper {
    int countByExample(UactExample example);

    int deleteByExample(UactExample example);

    int insert(Uact record);

    int insertSelective(Uact record);

    List<Uact> selectByExample(UactExample example);

    int updateByExampleSelective(@Param("record") Uact record, @Param("example") UactExample example);

    int updateByExample(@Param("record") Uact record, @Param("example") UactExample example);
}