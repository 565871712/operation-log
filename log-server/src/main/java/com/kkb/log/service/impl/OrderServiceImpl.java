package com.kkb.log.service.impl;

import com.kkb.log.beans.Order;
import com.kkb.log.constants.LogRecordType;
import com.kkb.logapi.context.LogRecordContext;
import com.kkb.logapi.starter.annotation.LogRecordAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import com.kkb.log.service.IOrderService;
import com.kkb.log.service.UserQueryService;

import javax.annotation.Resource;

/**
 * @author wangbaowei
 */
@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Resource
    private UserQueryService userQueryService;

    @Override
    @LogRecordAnnotation(
            fail = "创建订单失败，失败原因：「{{#_errorMsg}}」",
            category = "MANAGER_VIEW",
            detail = "{{#order.toString()}}",
            operator = "{{#currentUser}}",
            success = "{{#order.purchaseName}}下了一个订单,购买商品「{{#order.productName}}」,测试变量「{{#innerOrder.productName}}」,下单结果:{{#_ret}}",
            prefix = LogRecordType.ORDER, bizNo = "{{#order.orderNo}}")
    public boolean createOrder(Order order) {
        log.info("【创建订单】orderNo={}", order.getOrderNo());
        // db insert order
        Order order1 = new Order();
        order1.setProductName("内部变量测试");
        LogRecordContext.putVariable("innerOrder", order1);
        return true;
    }

    @Override
    @LogRecordAnnotation(success = "更新了订单{ORDER{#order.orderId}},更新内容为...",
            prefix = LogRecordType.ORDER, bizNo = "{{#order.orderNo}}",
            detail = "{{#order.toString()}}")
    public boolean update(Long orderId, Order order) {
        order.setOrderId(10000L);
        return false;
    }

    @Override
    @LogRecordAnnotation(success = "更新了订单ORDER{#orderId}},更新内容为...",
            prefix = LogRecordType.ORDER, bizNo = "{{#order.orderNo}}",
            condition = "{{#condition == null}}")
    public boolean testCondition(Long orderId, Order order, String condition) {
        return false;
    }

    @Override
    @LogRecordAnnotation(success = "更新了订单ORDER{#orderId}},更新内容为..{{#title}}}",
            prefix = LogRecordType.ORDER, bizNo = "{{#order.orderNo}}")
    public boolean testContextCallContext(Long orderId, Order order) {
        LogRecordContext.putVariable("title", "外层调用");
        userQueryService.getUserList(Lists.newArrayList("mzt"));
        return false;
    }
}
