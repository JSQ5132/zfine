package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Ordertemp;
import com.ykxj.zfine.model.OrdertempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdertempMapper {
    int countByExample(OrdertempExample example);

    int deleteByExample(OrdertempExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Ordertemp record);

    int insertSelective(Ordertemp record);

    List<Ordertemp> selectByExample(OrdertempExample example);

    Ordertemp selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Ordertemp record, @Param("example") OrdertempExample example);

    int updateByExample(@Param("record") Ordertemp record, @Param("example") OrdertempExample example);

    int updateByPrimaryKeySelective(Ordertemp record);

    int updateByPrimaryKey(Ordertemp record);
}