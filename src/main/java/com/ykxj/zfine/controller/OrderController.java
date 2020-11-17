package com.ykxj.zfine.controller;

import com.ykxj.zfine.common.ReturnResult;
import com.ykxj.zfine.common.api.CommonPage;
import com.ykxj.zfine.common.api.CommonResult;
import com.ykxj.zfine.model.mysql.Order;
import com.ykxj.zfine.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("订单列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<Order>> list(
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
        List<Order> orderList = orderService.listOrder("", pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(orderList));
    }

}
