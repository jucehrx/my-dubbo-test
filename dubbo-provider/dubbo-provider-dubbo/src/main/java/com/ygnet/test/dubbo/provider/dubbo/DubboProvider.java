package com.ygnet.test.dubbo.provider.dubbo;

import com.ygnet.test.dubbo.provider.api.support.TestServiceSupport;

/**
 * Created by xin on 15-2-10.
 */
public class DubboProvider extends TestServiceSupport {
    @Override
    public String sayHello(String name) {
        name += " Dubbo protocol ";
        return super.sayHello(name);
    }
}
