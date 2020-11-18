//package com.ykxj.zfine.dao;
//
//import com.ykxj.zfine.model.dto.Modultree;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface SysModuleMapper {
//    int countByExample(SysModuleExample example);
//
//    int deleteByExample(SysModuleExample example);
//
//    int deleteByPrimaryKey(String fId);
//
//    int insert(SysModule record);
//
//    int insertSelective(SysModule record);
//
//    List<SysModule> selectByExample(SysModuleExample example);
//
//    SysModule selectByPrimaryKey(String fId);
//
//    int updateByExampleSelective(@Param("record") SysModule record, @Param("example") SysModuleExample example);
//
//    int updateByExample(@Param("record") SysModule record, @Param("example") SysModuleExample example);
//
//    int updateByPrimaryKeySelective(SysModule record);
//
//    int updateByPrimaryKey(SysModule record);
//
//    List<Modultree> BaseResultMapTree();
//
//    List<SysModule> getMenu(String id);
//}
