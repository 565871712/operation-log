package com.kkb.logapi.servie;

import com.kkb.logapi.beans.Operator;

/**
 * 获取登录用户信息
 * @author wangbaowei
 */
public interface IOperatorGetService {

    /**
     * 获取用户信息
     * @return 转换为operator的用户信息
     */
    Operator getUser();

}
