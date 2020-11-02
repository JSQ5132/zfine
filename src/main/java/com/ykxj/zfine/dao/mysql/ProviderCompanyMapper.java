package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.ProviderCompany;
import com.ykxj.zfine.model.ProviderCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderCompanyMapper {
    int countByExample(ProviderCompanyExample example);

    int deleteByExample(ProviderCompanyExample example);

    int deleteByPrimaryKey(String fId);

    int insert(ProviderCompany record);

    int insertSelective(ProviderCompany record);

    List<ProviderCompany> selectByExample(ProviderCompanyExample example);

    ProviderCompany selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") ProviderCompany record, @Param("example") ProviderCompanyExample example);

    int updateByExample(@Param("record") ProviderCompany record, @Param("example") ProviderCompanyExample example);

    int updateByPrimaryKeySelective(ProviderCompany record);

    int updateByPrimaryKey(ProviderCompany record);
}