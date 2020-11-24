package com.ykxj.zfine.controller;


import cn.hutool.core.util.StrUtil;
import com.ykxj.zfine.common.api.CommonResult;

import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.model.dto.LoginDTO;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 10:47
 * @desc
 */
@Api(tags = "用户相关控制器")
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${jwt.token.tokenHeader}")
    private String tokenHeader;
    @Autowired
    UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public CommonResult list(
            @RequestBody @Validated LoginDTO loginDTO){
        String token = userService.login(loginDTO);
        return CommonResult.success(token);
    }

    @ApiOperation("用户注册")
    @PostMapping("/register")
    public CommonResult register(
            @RequestBody @Validated User User){
        String msg = userService.register(User);
        return CommonResult.success(msg);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
    public CommonResult refreshToken(HttpServletRequest request) {
        String oldToken = request.getHeader(tokenHeader);
        if (StrUtil.isEmpty(oldToken)){
            return CommonResult.failed("未获取当前token！");
        }
        return userService.refreshToken(oldToken);
    }

}
