package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SysItemsdetail;
import com.ykxj.zfine.model.SysItemsdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysItemsdetailMapper {
    int countByExample(SysItemsdetailExample example);

    int deleteByExample(SysItemsdetailExample example);

    int deleteByPrimaryKey(String fId);

    int insert(SysItemsdetail record);

    int insertSelective(SysItemsdetail record);

    List<SysItemsdetail> selectByExample(SysItemsdetailExample example);

    SysItemsdetail selectByPrimaryKey(String fId);

    int updateByExampleSelective(@Param("record") SysItemsdetail record, @Param("example") SysItemsdetailExample example);

    int updateByExample(@Param("record") SysItemsdetail record, @Param("example") SysItemsdetailExample example);

    int updateByPrimaryKeySelective(SysItemsdetail record);

    int updateByPrimaryKey(SysItemsdetail record);
}