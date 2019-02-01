package org.java.p03_abstract_factory;

import org.java.p03_abstract_factory.product.AbstractProduct;
import org.java.p03_abstract_factory.productfactory.AbstractProductFactory;
import org.java.p03_abstract_factory.productfactory.Product1Factory;
import org.java.p03_abstract_factory.productfactory.Product2Factory;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    /**
     * 在抽象工厂模式中
     * 产品族扩展困难，而不是产品等级。在该模式下，产品等级是非常容易扩展的，增
     加一个产品等级，只要增加一个工厂类负责新增加出来的产品生产任务即可。也就是说横向
     扩展容易，纵向扩展困难
     */



    @Test
    public void t2() {

        //定义出生产两个等级产品的工厂
        AbstractProductFactory factory1 = new Product1Factory();
        AbstractProductFactory factory2 = new Product2Factory();

        //生产一级的A类型
        AbstractProduct productA = factory1.createProductA();

        //生产二级的B类型
        AbstractProduct productB = factory2.createProductB();

        productA.say();
        productA.getType();
        productA.getLevel();

        productB.say();
        productB.getType();
        productB.getLevel();


    }
}
