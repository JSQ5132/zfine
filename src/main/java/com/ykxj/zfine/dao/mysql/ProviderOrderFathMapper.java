package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.ProviderOrderFath;
import com.ykxj.zfine.model.ProviderOrderFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderOrderFathMapper {
    int countByExample(ProviderOrderFathExample example);

    int deleteByExample(ProviderOrderFathExample example);

    int deleteByPrimaryKey(String fId);

    int insert(ProviderOrderFath record);

    int insertSelective(ProviderOrderFath record);

    List<ProviderOrderFath> selectByExample(ProviderOrderFathExample example);

    ProviderOrderFath selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") ProviderOrderFath record, @Param("example") ProviderOrderFathExample example);

    int updateByExample(@Param("record") ProviderOrderFath record, @Param("example") ProviderOrderFathExample example);

    int updateByPrimaryKeySelective(ProviderOrderFath record);

    int updateByPrimaryKey(ProviderOrderFath record);
}