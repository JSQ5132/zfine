package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.CostadjustChi;
import com.ykxj.zfine.model.CostadjustChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostadjustChiMapper {
    int countByExample(CostadjustChiExample example);

    int deleteByExample(CostadjustChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(CostadjustChi record);

    int insertSelective(CostadjustChi record);

    List<CostadjustChi> selectByExample(CostadjustChiExample example);

    CostadjustChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") CostadjustChi record, @Param("example") CostadjustChiExample example);

    int updateByExample(@Param("record") CostadjustChi record, @Param("example") CostadjustChiExample example);

    int updateByPrimaryKeySelective(CostadjustChi record);

    int updateByPrimaryKey(CostadjustChi record);
}