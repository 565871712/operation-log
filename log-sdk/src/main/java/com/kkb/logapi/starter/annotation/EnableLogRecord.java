package com.kkb.logapi.starter.annotation;

/**
 * @author wangbaowei
 */

import com.kkb.logapi.starter.support.LogRecordConfigureSelector;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LogRecordConfigureSelector.class)
public @interface EnableLogRecord {

    String tenant();

    AdviceMode mode() default AdviceMode.PROXY;

}
