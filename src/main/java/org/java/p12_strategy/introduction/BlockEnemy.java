package org.java.p12_strategy.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 妙计三：孙夫人断后
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
