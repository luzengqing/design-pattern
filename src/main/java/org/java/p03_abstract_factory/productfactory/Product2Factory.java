package org.java.p03_abstract_factory.productfactory;

import org.java.p03_abstract_factory.product.AbstractProduct;
import org.java.p03_abstract_factory.product.ProductA2;
import org.java.p03_abstract_factory.product.ProductB2;

/**
 * Created by lzq on 2018/3/21.
 */
public class Product2Factory extends AbstractProductFactory {

    /**
     * 该工厂只生产等级二级的产品
     */

    //只生产等级二级A类型产品
    @Override
    public AbstractProduct createProductA() {
        return new ProductA2();
    }

    //只生产等级二级B类型产品
    @Override
    public AbstractProduct createProductB() {
        return new ProductB2();
    }
}
