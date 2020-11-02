package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Organ;
import com.ykxj.zfine.model.OrganExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganMapper {
    int countByExample(OrganExample example);

    int deleteByExample(OrganExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Organ record);

    int insertSelective(Organ record);

    List<Organ> selectByExample(OrganExample example);

    Organ selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Organ record, @Param("example") OrganExample example);

    int updateByExample(@Param("record") Organ record, @Param("example") OrganExample example);

    int updateByPrimaryKeySelective(Organ record);

    int updateByPrimaryKey(Organ record);
}