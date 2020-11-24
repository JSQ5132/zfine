package com.ykxj.zfine.service.impl;

import com.ykxj.zfine.dao.mysql.CompanyMapper;
import com.ykxj.zfine.model.dto.CompanyDTO;
import com.ykxj.zfine.model.mysql.Company;
import com.ykxj.zfine.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JiangShengQiang
 * @date 2020/11/24 14:06
 * @desc
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return companyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public int insertSelective(Company company) {
        return companyMapper.insertSelective(company);
    }

    @Override
    public Company selectByPrimaryKey(Long id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Company company) {
        return companyMapper.updateByPrimaryKeySelective(company);
    }

    @Override
    public int updateByPrimaryKey(Company company) {
        return companyMapper.updateByPrimaryKey(company);
    }

    @Override
    public int saveCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setAddress(companyDTO.getAddress());
        company.setAppid("");
        company.setAppkey("");
        company.setCustomer(companyDTO.getCustomer());
        company.setEmail(companyDTO.getEmail());
        company.setDescription(companyDTO.getDescription());
        return companyMapper.insertSelective(company);

    }
}
