package org.java.p03_abstract_factory.productfactory;

import org.java.p03_abstract_factory.product.AbstractProduct;

/**
 * Created by lzq on 2018/3/21.
 */
public abstract class AbstractProductFactory {

    /**
     * 产品抽象工厂
     * 有N个产品族(产品线)，就有N个生产方法
     */



    //生产A类型产品
    public abstract AbstractProduct createProductA();


    //生产B类型产品
    public abstract AbstractProduct createProductB();
}
