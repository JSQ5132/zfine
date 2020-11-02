package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.AcceptFath;
import com.ykxj.zfine.model.AcceptFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceptFathMapper {
    int countByExample(AcceptFathExample example);

    int deleteByExample(AcceptFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(AcceptFath record);

    int insertSelective(AcceptFath record);

    List<AcceptFath> selectByExample(AcceptFathExample example);

    AcceptFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") AcceptFath record, @Param("example") AcceptFathExample example);

    int updateByExample(@Param("record") AcceptFath record, @Param("example") AcceptFathExample example);

    int updateByPrimaryKeySelective(AcceptFath record);

    int updateByPrimaryKey(AcceptFath record);
}