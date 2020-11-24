package com.ykxj.zfine.service;

import com.ykxj.zfine.model.dto.CompanyDTO;
import com.ykxj.zfine.model.mysql.Company;

/**
 * @author JiangShengQiang
 * @date 2020/11/24 14:05
 * @desc
 */
public interface CompanyService {
    int deleteByPrimaryKey(Long id);

    int insert(Company company);

    int insertSelective(Company company);

    Company selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Company company);

    int updateByPrimaryKey(Company company);

    int saveCompany(CompanyDTO companyDTO);
}
