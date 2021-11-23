package com.kkb.logapi.starter.support.aop;

import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * pointCut 切点
 * @author wangbaowei
 */
public class LogRecordPointcut extends StaticMethodMatcherPointcut implements Serializable {

    private LogRecordOperationSource logRecordOperationSource;


    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        //判断是否有日志标签
        return !CollectionUtils.isEmpty(logRecordOperationSource.computeLogRecordOperations(method, targetClass));
    }

    void setLogRecordOperationSource(LogRecordOperationSource logRecordOperationSource) {
        this.logRecordOperationSource = logRecordOperationSource;
    }
}
