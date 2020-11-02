package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.ProviderOrderChi;
import com.ykxj.zfine.model.ProviderOrderChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderOrderChiMapper {
    int countByExample(ProviderOrderChiExample example);

    int deleteByExample(ProviderOrderChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(ProviderOrderChi record);

    int insertSelective(ProviderOrderChi record);

    List<ProviderOrderChi> selectByExample(ProviderOrderChiExample example);

    ProviderOrderChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") ProviderOrderChi record, @Param("example") ProviderOrderChiExample example);

    int updateByExample(@Param("record") ProviderOrderChi record, @Param("example") ProviderOrderChiExample example);

    int updateByPrimaryKeySelective(ProviderOrderChi record);

    int updateByPrimaryKey(ProviderOrderChi record);
}