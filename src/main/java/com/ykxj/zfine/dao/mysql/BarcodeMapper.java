package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.Barcode;
import com.ykxj.zfine.model.BarcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BarcodeMapper {
    int countByExample(BarcodeExample example);

    int deleteByExample(BarcodeExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Barcode record);

    int insertSelective(Barcode record);

    List<Barcode> selectByExample(BarcodeExample example);

    Barcode selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Barcode record, @Param("example") BarcodeExample example);

    int updateByExample(@Param("record") Barcode record, @Param("example") BarcodeExample example);

    int updateByPrimaryKeySelective(Barcode record);

    int updateByPrimaryKey(Barcode record);
}