package com.ykxj.zfine.service;

import com.ykxj.zfine.model.mysql.Order;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 15:25
 * @desc
 */
public interface OrderService {

    List<Order> listOrder(String keyword, int pageNum, int pageSize);

}
