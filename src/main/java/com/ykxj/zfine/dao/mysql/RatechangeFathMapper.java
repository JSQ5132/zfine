package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.RatechangeFath;
import com.ykxj.zfine.model.RatechangeFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RatechangeFathMapper {
    int countByExample(RatechangeFathExample example);

    int deleteByExample(RatechangeFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(RatechangeFath record);

    int insertSelective(RatechangeFath record);

    List<RatechangeFath> selectByExample(RatechangeFathExample example);

    RatechangeFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") RatechangeFath record, @Param("example") RatechangeFathExample example);

    int updateByExample(@Param("record") RatechangeFath record, @Param("example") RatechangeFathExample example);

    int updateByPrimaryKeySelective(RatechangeFath record);

    int updateByPrimaryKey(RatechangeFath record);
}