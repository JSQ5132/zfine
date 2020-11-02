package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Pbcatedt;
import com.ykxj.zfine.model.PbcatedtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbcatedtMapper {
    int countByExample(PbcatedtExample example);

    int deleteByExample(PbcatedtExample example);

    int insert(Pbcatedt record);

    int insertSelective(Pbcatedt record);

    List<Pbcatedt> selectByExample(PbcatedtExample example);

    int updateByExampleSelective(@Param("record") Pbcatedt record, @Param("example") PbcatedtExample example);

    int updateByExample(@Param("record") Pbcatedt record, @Param("example") PbcatedtExample example);
}