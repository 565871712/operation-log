package com.kkb.logapi.servie.impl;

import com.kkb.logapi.servie.IParseFunction;

/**
 * @author wangbaowei
 */
public class DefaultParseFunction implements IParseFunction {

    @Override
    public boolean executeBefore() {
        return true;
    }

    @Override
    public String functionName() {
        return null;
    }

    @Override
    public String apply(String value) {
        return null;
    }
}
