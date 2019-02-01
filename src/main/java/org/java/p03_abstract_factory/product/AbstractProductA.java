package org.java.p03_abstract_factory.product;

/**
 * Created by lzq on 2018/3/21.
 */
public abstract class AbstractProductA extends AbstractProduct {


    @Override
    public void getType() {
        System.out.println("我是A类型产品");
    }

}
