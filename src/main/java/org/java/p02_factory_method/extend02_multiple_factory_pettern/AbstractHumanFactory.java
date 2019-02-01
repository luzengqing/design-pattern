package org.java.p02_factory_method.extend02_multiple_factory_pettern;

import org.java.p02_factory_method.Human;

/**
 * Created by lzq on 2018/3/21.
 */
public abstract class AbstractHumanFactory {

    /**
     * 所有产品在一个工厂里生产，当项目越来越复杂，该方法就会无比巨大，结构不清晰
     * 现在对于每种产品，对应一个工厂，符合单一职责原则
     * 这里入参就不需要了，因为每一个具体的工厂都已经非常明确自己的职责：创建自己负责的产品类对象。
     * @return
     */

    public abstract Human createHuman();
}
