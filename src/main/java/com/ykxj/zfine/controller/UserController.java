package com.ykxj.zfine.controller;


import com.ykxj.zfine.common.api.CommonResult;

import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.model.dto.LoginDTO;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 10:47
 * @desc
 */
@Api(tags = "用户相关控制器")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public CommonResult list(
            @RequestBody @Validated LoginDTO loginDTO){
        String account = loginDTO.getAccount();
        String password = loginDTO.getPassword();

        //用户信息
        User user = userService.getUserByAccount(account);
        //账号不存在、密码错误
        if (user == null || !user.getPassword().equals(password)) {
            return CommonResult.validateFailed("账号或密码有误");
        } else {
            String token = JWTUtils.sign(account, password,30);
            return CommonResult.success(token);
        }

    }
}
