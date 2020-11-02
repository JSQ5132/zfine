package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Usercache;
import com.ykxj.zfine.model.UsercacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercacheMapper {
    int countByExample(UsercacheExample example);

    int deleteByExample(UsercacheExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Usercache record);

    int insertSelective(Usercache record);

    List<Usercache> selectByExample(UsercacheExample example);

    Usercache selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Usercache record, @Param("example") UsercacheExample example);

    int updateByExample(@Param("record") Usercache record, @Param("example") UsercacheExample example);

    int updateByPrimaryKeySelective(Usercache record);

    int updateByPrimaryKey(Usercache record);
}