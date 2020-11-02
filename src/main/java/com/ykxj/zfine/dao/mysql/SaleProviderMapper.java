package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SaleProvider;
import com.ykxj.zfine.model.SaleProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleProviderMapper {
    int countByExample(SaleProviderExample example);

    int deleteByExample(SaleProviderExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(SaleProvider record);

    int insertSelective(SaleProvider record);

    List<SaleProvider> selectByExample(SaleProviderExample example);

    SaleProvider selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") SaleProvider record, @Param("example") SaleProviderExample example);

    int updateByExample(@Param("record") SaleProvider record, @Param("example") SaleProviderExample example);

    int updateByPrimaryKeySelective(SaleProvider record);

    int updateByPrimaryKey(SaleProvider record);
}