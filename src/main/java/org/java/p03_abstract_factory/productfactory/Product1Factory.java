package org.java.p03_abstract_factory.productfactory;

import org.java.p03_abstract_factory.product.AbstractProduct;
import org.java.p03_abstract_factory.product.ProductA1;
import org.java.p03_abstract_factory.product.ProductB1;

/**
 * Created by lzq on 2018/3/21.
 */
public class Product1Factory extends AbstractProductFactory {

    /**
     * 该工厂只生产等级一级的产品
     * 有M个等级产品就有M个相应的生产工厂
     */

    //只生产等级一级A类型产品
    @Override
    public AbstractProduct createProductA() {
        return new ProductA1();
    }

    //只生产等级一级B类型产品
    @Override
    public AbstractProduct createProductB() {
        return new ProductB1();
    }
}
