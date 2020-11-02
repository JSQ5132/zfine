package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.AcceptChi;
import com.ykxj.zfine.model.AcceptChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceptChiMapper {
    int countByExample(AcceptChiExample example);

    int deleteByExample(AcceptChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(AcceptChi record);

    int insertSelective(AcceptChi record);

    List<AcceptChi> selectByExample(AcceptChiExample example);

    AcceptChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") AcceptChi record, @Param("example") AcceptChiExample example);

    int updateByExample(@Param("record") AcceptChi record, @Param("example") AcceptChiExample example);

    int updateByPrimaryKeySelective(AcceptChi record);

    int updateByPrimaryKey(AcceptChi record);
}