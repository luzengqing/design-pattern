package org.java.p03_abstract_factory.product;

/**
 * Created by lzq on 2018/3/21.
 * 产品的抽象类
 */
public abstract class AbstractProduct {

    //共同方法
    public void say() {
        System.out.println("我们都是产品");
    }

    //特殊方法，自己实现
    public abstract void getType();

    public abstract void getLevel();
}
