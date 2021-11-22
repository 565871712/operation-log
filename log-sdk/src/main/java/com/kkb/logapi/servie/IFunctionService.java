package com.kkb.logapi.servie;

/**
 * @author wangbaowei
 */
public interface IFunctionService {

    String apply(String functionName, String value);

    boolean beforeFunction(String functionName);
}
