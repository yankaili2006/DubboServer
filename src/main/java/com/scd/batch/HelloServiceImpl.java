package com.scd.batch;

/**
 * Created by liwei on 2016-11-29.
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
