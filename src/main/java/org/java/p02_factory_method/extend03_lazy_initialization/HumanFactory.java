package org.java.p02_factory_method.extend03_lazy_initialization;

import org.java.p02_factory_method.Human;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzq on 2018/3/21.
 * 延迟初始化
 * 减少对象的创建和销毁对资源的浪费
 */
public class HumanFactory {

    /**
     * 定义一个Map容器，容纳所有产生的对象，如果在Map容器中已
     经有的对象，则直接取出返回；如果没有，则根据需要的类型产生一个对象并放入到Map容
     器中，以方便下次调用
     */
    private static Map<String, Human> map = new HashMap<>();

    public static synchronized <T extends Human> Human createHuman(Class<T> clazz) {

        if (map.containsKey(clazz.getName())) {
            //有该类型的产品，就重缓存中取出
            return map.get(clazz.getName());
        } else {
            //没有再创建产品，并放入缓存
            Human human = null;
            try {
                human = clazz.newInstance();
                map.put(clazz.getName(), human);
            }
            catch (Exception e) {
                System.out.println("创建人类失败");
                e.printStackTrace();
            }
            return human;
        }


    }
}
