package com.kkb.logapi.beans;

import lombok.Builder;
import lombok.Data;

/**
 * @author wangbaowei
 */

@Data
@Builder
public class LogRecordOps {
    private String successLogTemplate;
    private String failLogTemplate;
    private String operatorId;
    private String bizKey;
    private String bizNo;
    private String category;
    private String detail;
    private String condition;
}
