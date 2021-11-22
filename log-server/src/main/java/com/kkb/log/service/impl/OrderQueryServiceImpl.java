package com.kkb.log.service.impl;

import com.kkb.log.beans.Order;
import org.springframework.stereotype.Service;
import com.kkb.log.service.OrderQueryService;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {
    @Override
    public Order queryOrder(long parseLong) {
        Order order = new Order();
        order.setProductName("oooo");
        return order;
    }
}
