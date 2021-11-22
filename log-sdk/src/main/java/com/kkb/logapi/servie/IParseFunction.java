package com.kkb.logapi.servie;

/**
 * 函数代表了自定义函数是否在业务代码执行之前解析，上面提到的查询修改之前的内容。
 * @author wangbaowei
 */
public interface IParseFunction {

    default boolean executeBefore(){
        return false;
    }

    String functionName();

    String apply(String value);
}
