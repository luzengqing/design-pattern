package org.java.p05_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/3/22.
 * 导演 负责已有模块的装配顺序
 */
public class Director {

    private AbstractCarBuilder bmwBuilder = new BMWBuilder();
    private AbstractCarBuilder audiBuilder = new AudiBuilder();

    /**
     * 获取A类型的宝马 按启动，引擎轰鸣，喇叭声，停车顺序
     * @return
     */
    public AbstractCar getBMWModelA() {
        List<String> sequence = new ArrayList<>();
        sequence.clear();

        sequence.add("start");
        sequence.add("engine");
        sequence.add("alarm");
        sequence.add("stop");

        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCar();

    }

    /**
     * 获取B类型的宝马 先引擎轰鸣一下，再启动
     * @return
     */
    public AbstractCar getBMWModelB() {
        List<String> sequence = new ArrayList<>();
        sequence.clear();

        sequence.add("engine");
        sequence.add("start");

        bmwBuilder.setSequence(sequence);
        return bmwBuilder.getCar();

    }

    /**
     * 获取A类型的奥迪 只能喇叭发出声音，不能启动
     * @return
     */
    public AbstractCar getAudiModelA() {
        List<String> sequence = new ArrayList<>();

        sequence.add("alarm");

        audiBuilder.setSequence(sequence);
        return audiBuilder.getCar();

    }

    /**
     * 获取B类型的奥迪 一启动就挺不下来
     * @return
     */
    public AbstractCar getAudiModelB() {
        List<String> sequence = new ArrayList<>();
        sequence.add("start");

        audiBuilder.setSequence(sequence);
        return audiBuilder.getCar();

    }
}
