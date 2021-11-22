package com.kkb.log.service.impl;

import com.kkb.log.constants.LogRecordType;
import com.kkb.logapi.context.LogRecordContext;
import com.kkb.logapi.starter.annotation.LogRecordAnnotation;
import org.apache.catalina.User;
import com.kkb.log.service.UserQueryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQueryServiceImpl implements UserQueryService {
    @Override
    @LogRecordAnnotation(success = "获取用户列表,内层方法调用人{{#user}}", prefix = LogRecordType.ORDER, bizNo = "{{#user}}")
    public List<User> getUserList(List<String> userIds) {
        LogRecordContext.putVariable("user", "mzt");
        return null;
    }
}
