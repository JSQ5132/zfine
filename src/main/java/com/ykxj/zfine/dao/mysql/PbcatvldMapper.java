package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Pbcatvld;
import com.ykxj.zfine.model.PbcatvldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbcatvldMapper {
    int countByExample(PbcatvldExample example);

    int deleteByExample(PbcatvldExample example);

    int insert(Pbcatvld record);

    int insertSelective(Pbcatvld record);

    List<Pbcatvld> selectByExample(PbcatvldExample example);

    int updateByExampleSelective(@Param("record") Pbcatvld record, @Param("example") PbcatvldExample example);

    int updateByExample(@Param("record") Pbcatvld record, @Param("example") PbcatvldExample example);
}