package com.ygnet.test.dubbo.provider.api.support;

import com.alibaba.dubbo.rpc.RpcContext;
import com.ygnet.test.dubbo.provider.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xin on 15-2-10.
 */
public class TestServiceSupport implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
