package com.kkb.log.service;

import com.kkb.log.beans.Order;

/**
 * @author wangbaowei
 */
public interface IOrderService {

    boolean createOrder(Order order);

    boolean update(Long orderId, Order order);

    boolean testCondition(Long orderId, Order order, String condition);

    boolean testContextCallContext(Long orderId, Order order);
}
