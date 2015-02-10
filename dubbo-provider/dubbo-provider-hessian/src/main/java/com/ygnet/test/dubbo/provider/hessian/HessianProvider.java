package com.ygnet.test.dubbo.provider.hessian;

import com.ygnet.test.dubbo.provider.api.support.TestServiceSupport;

/**
 * Created by xin on 15-2-10.
 */
public class HessianProvider extends TestServiceSupport {
    @Override
    public String sayHello(String name) {
        name += "Hessian protocol";
        return super.sayHello(name);
    }
}
