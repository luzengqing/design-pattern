package org.java.p02_factory_method.extend01_simple_factory_pattern;

import org.java.p02_factory_method.BlackHuman;
import org.java.p02_factory_method.Human;
import org.java.p02_factory_method.WhiteHuman;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    @Test
    public void t1() {
        //使用静态工厂去生产人类
        Human human1 = HumanFactory.createHuman(WhiteHuman.class);
        Human human2 = HumanFactory.createHuman(BlackHuman.class);
        human1.say();
        human2.say();
    }
}
