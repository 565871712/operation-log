package com.kkb.logapi.servie;

/**
 * 自定义函数接口，在日志自定义函数并进行处理
 * @author wangbaowei
 */
public interface IFunctionService {

    String apply(String functionName, String value);

    boolean beforeFunction(String functionName);
}
