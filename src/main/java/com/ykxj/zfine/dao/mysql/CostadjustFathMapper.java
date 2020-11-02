package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.CostadjustFath;
import com.ykxj.zfine.model.CostadjustFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostadjustFathMapper {
    int countByExample(CostadjustFathExample example);

    int deleteByExample(CostadjustFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(CostadjustFath record);

    int insertSelective(CostadjustFath record);

    List<CostadjustFath> selectByExample(CostadjustFathExample example);

    CostadjustFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") CostadjustFath record, @Param("example") CostadjustFathExample example);

    int updateByExample(@Param("record") CostadjustFath record, @Param("example") CostadjustFathExample example);

    int updateByPrimaryKeySelective(CostadjustFath record);

    int updateByPrimaryKey(CostadjustFath record);
}