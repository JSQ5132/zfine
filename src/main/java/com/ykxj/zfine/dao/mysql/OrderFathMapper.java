package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.OrderFath;
import com.ykxj.zfine.model.OrderFathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderFathMapper {
    int countByExample(OrderFathExample example);

    int deleteByExample(OrderFathExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(OrderFath record);

    int insertSelective(OrderFath record);

    List<OrderFath> selectByExample(OrderFathExample example);

    OrderFath selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") OrderFath record, @Param("example") OrderFathExample example);

    int updateByExample(@Param("record") OrderFath record, @Param("example") OrderFathExample example);

    int updateByPrimaryKeySelective(OrderFath record);

    int updateByPrimaryKey(OrderFath record);
}