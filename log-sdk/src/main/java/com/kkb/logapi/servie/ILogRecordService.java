package com.kkb.logapi.servie;

import com.kkb.logapi.beans.LogRecord;

import java.util.List;

/**
 * 日志相关接口
 * @author wangbaowei
 */
public interface ILogRecordService {

    /**
     * 保存log接口
     *
     * @param logRecord log日志实体
     */
    void saveRecord(LogRecord logRecord);

    /**
     * 查询操作日志
     *
     * @param bizKey 操作日志前缀
     * @return List<LogRecord></> 操作日志列表
     */
    List<LogRecord> listLog(String bizKey);

}
