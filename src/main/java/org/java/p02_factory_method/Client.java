package org.java.p02_factory_method;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    @Test
    public void t1() {
        //创建一个生产人类的工厂
        AbstractHumanFactory factory = new HumanFactory();

        /**
         *  根据输入参数的类型，工厂去生产相应的产品实例，客户并不关心生产的过程, 符合迪米特法则
         *  工厂与外界通过产品类型的抽象去联系，符合依赖倒置法则
         *  如果需要新的产品，只要传入新的产品类型即可，通过扩展拥抱变化，符合开闭原则
         */
        Human human1 = factory.createHuman(WhiteHuman.class);
        Human human2 = factory.createHuman(BlackHuman.class);
        Human human3 = factory.createHuman(YellowHuman.class);

        //工厂生产出来的人类，去调用各自的方法
        human1.say();
        human2.say();
        human3.say();
    }
}
