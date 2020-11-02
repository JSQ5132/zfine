package com.ykxj.zfine.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"测试控制器"})
@RestController
public class TestController {

    @ApiOperation("测试restAPI")
    @RequestMapping("/test")
    public String test(){

        return "this is test method";
    }
}
