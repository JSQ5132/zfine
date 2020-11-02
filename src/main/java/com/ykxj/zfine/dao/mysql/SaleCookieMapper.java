package com.ykxj.zfine.dao.mysql;

import com.ykxj.zfine.model.SaleCookie;
import com.ykxj.zfine.model.SaleCookieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleCookieMapper {
    int countByExample(SaleCookieExample example);

    int deleteByExample(SaleCookieExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(SaleCookie record);

    int insertSelective(SaleCookie record);

    List<SaleCookie> selectByExample(SaleCookieExample example);

    SaleCookie selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") SaleCookie record, @Param("example") SaleCookieExample example);

    int updateByExample(@Param("record") SaleCookie record, @Param("example") SaleCookieExample example);

    int updateByPrimaryKeySelective(SaleCookie record);

    int updateByPrimaryKey(SaleCookie record);
}