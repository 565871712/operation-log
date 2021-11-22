package com.kkb.log;

import com.kkb.log.beans.Order;
import com.kkb.log.service.IOrderService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class IOrderServiceTest extends BaseTest{

    @Resource
    private IOrderService orderService;

    @Test
    public void createOrder() {
        Order order = new Order();
        order.setOrderNo("MT0000011");
        order.setProductName("超值优惠红烧肉套餐");
        order.setPurchaseName("张三");
        boolean ret = orderService.createOrder(order);
        Assert.assertTrue(ret);
    }

}
