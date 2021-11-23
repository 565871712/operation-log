package com.kkb.logapi.servie.impl;

import com.google.common.collect.Lists;
import com.kkb.logapi.beans.LogRecord;
import com.kkb.logapi.servie.ILogRecordService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 默认日志实现接口
 * @author wangbaowei
 */
@Slf4j
public class DefaultLogRecordServiceImpl implements ILogRecordService {

    @Override
    public void saveRecord(LogRecord logRecord) {
        log.info("【logRecord】log={}", logRecord);
    }

    @Override
    public List<LogRecord> listLog(String bizKey) {
        return Lists.newArrayList();
    }
}
