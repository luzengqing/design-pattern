package org.java.p05_builder;

import java.util.List;

/**
 * Created by lzq on 2018/3/22.
 * 奥迪车建造者
 */
public class AudiBuilder extends AbstractCarBuilder {

    //建造者持有该产品
    private AbstractCar audi = new AudiCar();

    @Override
    public void setSequence(List<String> sequence) {
        this.audi.setSequence(sequence);
    }

    @Override
    public AbstractCar getCar() {
        return this.audi;
    }
}
