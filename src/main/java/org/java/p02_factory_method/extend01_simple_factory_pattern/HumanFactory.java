package org.java.p02_factory_method.extend01_simple_factory_pattern;

import org.java.p02_factory_method.Human;

/**
 * Created by lzq on 2018/3/21.
 * 工厂方法扩展1
 * 简单工厂模板（静态工厂模板）
 */
public class HumanFactory {

    //去掉继承抽象类，并在createHuman前增加static

    public static <T extends Human> Human createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = clazz.newInstance();
        }
        catch (Exception e) {
            System.out.println("创建人类失败");
            e.printStackTrace();
        }
        return human;
    }
}
