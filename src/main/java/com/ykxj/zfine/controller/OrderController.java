package com.ykxj.zfine.controller;

import com.ykxj.zfine.common.api.CommonPage;
import com.ykxj.zfine.common.api.CommonResult;
import com.ykxj.zfine.model.mysql.Order;
import com.ykxj.zfine.model.mysql.OrderDetail;
import com.ykxj.zfine.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 10:54
 * @desc 商品订货单模块控制器
 */

@Api(tags = {"商品订货单模块控制器"})
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequiresPermissions({"/order/list"}) //没有的话 AuthorizationException
    @ApiOperation("订单列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<Order>> list(
            @RequestHeader("token")String token,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Order> orderList = orderService.listOrder("", pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(orderList));
    }
    @RequiresPermissions({"/order/test"}) //没有的话 AuthorizationException
    @ApiOperation("订单列表")
    @GetMapping("/test")
    public String  test(
            @RequestHeader("token")String token){
       return "test-test-test-test-test-test-test";
    }

//    @ApiOperation("订单详情")
//    @GetMapping("/detail/{number}")
//    public CommonResult<List<OrderDetail>> detail(@PathVariable String number){
//        List<OrderDetail> orderList = orderService.getOrderDetailByNumber(number);
//        return CommonResult.success(orderList);
//    }

}
