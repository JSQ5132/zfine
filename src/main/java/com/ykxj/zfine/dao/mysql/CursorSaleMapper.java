package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.CursorSale;
import com.ykxj.zfine.model.CursorSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CursorSaleMapper {
    int countByExample(CursorSaleExample example);

    int deleteByExample(CursorSaleExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(CursorSale record);

    int insertSelective(CursorSale record);

    List<CursorSale> selectByExample(CursorSaleExample example);

    CursorSale selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") CursorSale record, @Param("example") CursorSaleExample example);

    int updateByExample(@Param("record") CursorSale record, @Param("example") CursorSaleExample example);

    int updateByPrimaryKeySelective(CursorSale record);

    int updateByPrimaryKey(CursorSale record);
}