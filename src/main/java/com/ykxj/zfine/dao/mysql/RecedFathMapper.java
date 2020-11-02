package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.RecedFath;
import com.ykxj.zfine.model.RecedFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecedFathMapper {
    int countByExample(RecedFathExample example);

    int deleteByExample(RecedFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(RecedFath record);

    int insertSelective(RecedFath record);

    List<RecedFath> selectByExample(RecedFathExample example);

    RecedFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") RecedFath record, @Param("example") RecedFathExample example);

    int updateByExample(@Param("record") RecedFath record, @Param("example") RecedFathExample example);

    int updateByPrimaryKeySelective(RecedFath record);

    int updateByPrimaryKey(RecedFath record);
}