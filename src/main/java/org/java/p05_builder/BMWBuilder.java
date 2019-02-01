package org.java.p05_builder;

import java.util.List;

/**
 * Created by lzq on 2018/3/22.
 * 宝马车建造者
 */
public class BMWBuilder extends AbstractCarBuilder {

    //建造者持有该产品
    private AbstractCar bmw = new BMWCar();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public AbstractCar getCar() {
        return this.bmw;
    }
}
