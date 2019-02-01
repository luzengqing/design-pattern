package org.java.p13_adapter.extension;

/**
 * Created by lzq on 2018/4/3.
 * 目标角色实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void doSomething1() {
        System.out.println("ConcreteTarget doSomething1");
    }

    @Override
    public void doSomething2() {
        System.out.println("ConcreteTarget doSomething2");
    }
}
