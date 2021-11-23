package com.kkb.logapi.servie.impl;

import com.kkb.logapi.beans.Operator;
import com.kkb.logapi.servie.IOperatorGetService;

/**
 * 默认用户信息实现接口
 * @author wangbaowei
 */
public class DefaultOperatorGetServiceImpl implements IOperatorGetService {

    @Override
    public Operator getUser() {
        Operator operator = new Operator();
        operator.setOperatorId("111");
        return operator;
    }
}
