package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.UsercacheFreeze;
import com.ykxj.zfine.model.UsercacheFreezeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercacheFreezeMapper {
    int countByExample(UsercacheFreezeExample example);

    int deleteByExample(UsercacheFreezeExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(UsercacheFreeze record);

    int insertSelective(UsercacheFreeze record);

    List<UsercacheFreeze> selectByExample(UsercacheFreezeExample example);

    UsercacheFreeze selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") UsercacheFreeze record, @Param("example") UsercacheFreezeExample example);

    int updateByExample(@Param("record") UsercacheFreeze record, @Param("example") UsercacheFreezeExample example);

    int updateByPrimaryKeySelective(UsercacheFreeze record);

    int updateByPrimaryKey(UsercacheFreeze record);
}