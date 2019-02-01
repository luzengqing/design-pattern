package org.java.p02_factory_method.extend03_lazy_initialization;

import org.java.p02_factory_method.Human;
import org.java.p02_factory_method.WhiteHuman;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    @Test
    public void t1() {
        //延迟初始化，从工厂里多次取出的同一类产品是同一个

        Human human1 = HumanFactory.createHuman(WhiteHuman.class);
        Human human2 = HumanFactory.createHuman(WhiteHuman.class);
        human1.say();
        human2.say();
    }
}
