package org.java.p03_abstract_factory.product;

/**
 * Created by lzq on 2018/3/21.
 */
public abstract class AbstractProductB extends AbstractProduct {

    @Override
    public void getType() {
        System.out.println("我是B类型产品");
    }
}
