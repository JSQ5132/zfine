package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Pbcatcol;
import com.ykxj.zfine.model.PbcatcolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbcatcolMapper {
    int countByExample(PbcatcolExample example);

    int deleteByExample(PbcatcolExample example);

    int insert(Pbcatcol record);

    int insertSelective(Pbcatcol record);

    List<Pbcatcol> selectByExample(PbcatcolExample example);

    int updateByExampleSelective(@Param("record") Pbcatcol record, @Param("example") PbcatcolExample example);

    int updateByExample(@Param("record") Pbcatcol record, @Param("example") PbcatcolExample example);
}