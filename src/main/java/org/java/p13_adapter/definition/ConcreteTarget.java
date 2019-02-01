package org.java.p13_adapter.definition;

/**
 * Created by lzq on 2018/4/3.
 * 目标角色的实现
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("Hi, Can I help you ?");
    }
}
