package com.ygnet.test.dubbo.provider.api.support;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xin on 15-2-10.
 */
public class MainSupport {
    public static void main(String args[]) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
