package com.kkb.logapi.servie.impl;

import com.kkb.logapi.beans.Operator;
import com.kkb.logapi.servie.IOperatorGetService;

/**
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
