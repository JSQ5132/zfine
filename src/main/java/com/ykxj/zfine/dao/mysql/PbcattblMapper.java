package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Pbcattbl;
import com.ykxj.zfine.model.PbcattblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbcattblMapper {
    int countByExample(PbcattblExample example);

    int deleteByExample(PbcattblExample example);

    int insert(Pbcattbl record);

    int insertSelective(Pbcattbl record);

    List<Pbcattbl> selectByExample(PbcattblExample example);

    int updateByExampleSelective(@Param("record") Pbcattbl record, @Param("example") PbcattblExample example);

    int updateByExample(@Param("record") Pbcattbl record, @Param("example") PbcattblExample example);
}