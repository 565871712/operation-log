package com.kkb.log.function;

import com.kkb.logapi.servie.IParseFunction;

/**
 * @author wangbaowei
 */
public class OrderParseFunction implements IParseFunction {

    @Override
    public boolean executeBefore() {
        return true;
    }

    @Override
    public String functionName() {
        return "ORDER";
    }

    @Override
    public String apply(String value) {
        return null;
    }
}
