package com.jiguang.componant.impl;

import com.jiguang.componant.MQService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MQServiceImpl implements MQService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;


}
