package com.kkb.logapi.starter.support.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author wangbaowei
 */
public class BeanFactoryLogRecordAdvisor extends AbstractBeanFactoryPointcutAdvisor {

    private final LogRecordPointcut pointcut = new LogRecordPointcut();
    private LogRecordOperationSource logRecordOperationSource;

    public void setClassFilter(ClassFilter classFilter) {
        this.pointcut.setClassFilter(classFilter);
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    public void setLogRecordOperationSource(LogRecordOperationSource logRecordOperationSource) {
        pointcut.setLogRecordOperationSource(logRecordOperationSource);
    }
}
