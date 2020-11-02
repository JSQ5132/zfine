package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.OrderChi;
import com.ykxj.zfine.model.OrderChiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderChiMapper {
    int countByExample(OrderChiExample example);

    int deleteByExample(OrderChiExample example);

    int deleteByPrimaryKey(Integer nd);

    int insert(OrderChi record);

    int insertSelective(OrderChi record);

    List<OrderChi> selectByExample(OrderChiExample example);

    OrderChi selectByPrimaryKey(Integer nd);

    int updateByExampleSelective(@Param("record") OrderChi record, @Param("example") OrderChiExample example);

    int updateByExample(@Param("record") OrderChi record, @Param("example") OrderChiExample example);

    int updateByPrimaryKeySelective(OrderChi record);

    int updateByPrimaryKey(OrderChi record);
}