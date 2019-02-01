package org.java.p05_builder;

import java.util.List;

/**
 * Created by lzq on 2018/3/22.
 * 抽象建造者，规范产品的装配工艺（顺序）
 */
public abstract class AbstractCarBuilder {

    //指定产品的装配工艺
    public abstract void setSequence(List<String> sequence);

    //设置完顺序后，获得该产品
    public abstract AbstractCar getCar();


}
