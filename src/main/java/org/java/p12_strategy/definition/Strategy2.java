package org.java.p12_strategy.definition;

/**
 * Created by lzq on 2018/3/29.
 * 具体的策略
 */
public class Strategy2 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
