package org.java.p06_proxy.extend03_jdk_dynamic_proxy;

/**
 * Created by louis on 2018/3/24.
 */
public class Driver implements IDriver {

    private String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(this.name+"正在飙车。。。。。");
    }
}
