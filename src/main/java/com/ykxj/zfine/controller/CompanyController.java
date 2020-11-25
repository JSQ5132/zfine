package com.ykxj.zfine.controller;

import com.ykxj.zfine.common.api.CommonPage;
import com.ykxj.zfine.common.api.CommonResult;
import com.ykxj.zfine.model.dto.CompanyDTO;
import com.ykxj.zfine.model.dto.LoginDTO;
import com.ykxj.zfine.model.mysql.Order;
import com.ykxj.zfine.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/24 13:56
 * @desc 商场控制器
 */
@Api(tags = {"商场控制器"})
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequiresPermissions({"/company/save"}) //没有的话 AuthorizationException
    @ApiOperation("新增商场")
    @PostMapping("/save")
    public CommonResult save(@RequestBody  CompanyDTO companyDTO){
        int count = companyService.saveCompany(companyDTO);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
