package com.ykxj.zfine.service.impl;

import com.github.pagehelper.PageHelper;
import com.ykxj.zfine.dao.mysql.OrderDetailMapper;
import com.ykxj.zfine.dao.mysql.OrderMapper;

import com.ykxj.zfine.model.mysql.Order;
import com.ykxj.zfine.model.mysql.OrderExample;
import com.ykxj.zfine.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/17 15:27
 * @desc
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Override
    public List<Order> listOrder(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        OrderExample orderExample = new OrderExample();
        orderExample.setOrderByClause("bus_date desc");
        OrderExample.Criteria criteria = orderExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNumberLike("%" + keyword + "%");
        }
        return orderMapper.selectByExample(orderExample);
    }


}
