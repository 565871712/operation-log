package com.kkb.logapi.beans;


import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wangbaowei
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LogRecord implements Serializable{

    /**
     * 日志id
     */
    private Integer id;
    /**
     * 日志标识（标识业务）
     */
    private String tenant;
    /**
     * 链路id
     */
    @NotBlank(message = "bizKey required")
    @Length(max = 200, message = "appKey max length is 200")
    private String bizKey;
    /**
     * 链路标识
     */
    @NotBlank(message = "bizNo required")
    @Length(max = 200, message = "bizNo max length is 200")
    private String bizNo;

    @NotBlank(message = "operator required")
    @Length(max = 63, message = "operator max length 63")
    private String operator;

    @NotBlank(message = "opAction required")
    @Length(max = 511, message = "operator max length 511")
    private String action;

    private String category;

    private Date createTime;

    private String detail;

}
