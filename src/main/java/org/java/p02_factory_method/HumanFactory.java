package org.java.p02_factory_method;

/**
 * Created by lzq on 2018/3/21.
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> Human createHuman(Class<T> clazz) {
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
