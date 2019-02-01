package org.java.p02_factory_method;

/**
 * Created by lzq on 2018/3/21.
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> Human createHuman(Class<T> clazz);
}
