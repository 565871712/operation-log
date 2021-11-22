package com.kkb.logapi.servie.impl;

import com.kkb.logapi.servie.IFunctionService;

/**
 * @author wangbaowei
 */
public class DefaultFunctionServiceImpl implements IFunctionService {

    private final ParseFunctionFactory parseFunctionFactory;

    public DefaultFunctionServiceImpl(ParseFunctionFactory parseFunctionFactory) {
        this.parseFunctionFactory = parseFunctionFactory;
    }


    @Override
    public String apply(String functionName, String value) {
        return null;
    }

    @Override
    public boolean beforeFunction(String functionName) {
        return false;
    }
}
