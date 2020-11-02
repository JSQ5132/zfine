package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Pbcatfmt;
import com.ykxj.zfine.model.PbcatfmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbcatfmtMapper {
    int countByExample(PbcatfmtExample example);

    int deleteByExample(PbcatfmtExample example);

    int insert(Pbcatfmt record);

    int insertSelective(Pbcatfmt record);

    List<Pbcatfmt> selectByExample(PbcatfmtExample example);

    int updateByExampleSelective(@Param("record") Pbcatfmt record, @Param("example") PbcatfmtExample example);

    int updateByExample(@Param("record") Pbcatfmt record, @Param("example") PbcatfmtExample example);
}