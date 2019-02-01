package org.java.p02_factory_method.extend02_multiple_factory_pettern;

import org.java.p02_factory_method.Human;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    @Test
    public void t1() {

        /**
         * 每个工厂负责生产相应的产品，很符合单一职责原则, 结构清晰，简单
         * 但是给可扩展性和可维护性带来了一定的影响。
         * 如果要扩展一个产品类，就需要建立一个相应的工厂类，这样就增加了扩展的难度。
         因为工厂类和产品类的数量相同，维护时需要考虑两个对象之间的关系。
         */

        /**
         * 在复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与
         各个子工厂交流，协调类的作用是封装子工厂类，对高层模块提供统一的访问接口。
         */
        AbstractHumanFactory factory1 = new BlackHumanFactory();
        AbstractHumanFactory factory2 = new WhiteHumanFactory();
        AbstractHumanFactory factory3 = new YellowHumanFactory();
        Human human1 = factory1.createHuman();
        Human human2 = factory2.createHuman();
        Human human3 = factory3.createHuman();
        Human human4 = factory3.createHuman();
        human1.say();
        human2.say();
        human3.say();
        human4.say();
    }

}
