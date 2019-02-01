package org.java.p12_strategy.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 承装妙计的锦囊
 */
public class Context {

    //包裹里的计谋
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用了妙计
    public void operate() {
        this.strategy.operate();
    }
}
