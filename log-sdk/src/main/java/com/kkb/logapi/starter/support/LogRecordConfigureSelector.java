package com.kkb.logapi.starter.support;

import com.kkb.logapi.starter.annotation.EnableLogRecord;
import com.kkb.logapi.starter.configuration.LogRecordProxyAutoConfiguration;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;

/**
 * @author wangbaowei
 */
public class LogRecordConfigureSelector extends AdviceModeImportSelector<EnableLogRecord> {

    private static final String ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME =
            "com.mzt.logapi.starter.configuration.LogRecordProxyAutoConfiguration";

    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{LogRecordProxyAutoConfiguration.class.getName()};
            case ASPECTJ:
                return new String[]{ASYNC_EXECUTION_ASPECT_CONFIGURATION_CLASS_NAME};
            default:
                return null;
        }
    }
}
