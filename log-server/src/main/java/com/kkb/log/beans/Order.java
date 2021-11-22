package com.kkb.log.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author wangbaowei
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long orderId;
    private String orderNo;
    private String purchaseName;
    private String productName;
    private Date createTime;
}
