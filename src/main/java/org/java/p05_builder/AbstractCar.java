package org.java.p05_builder;

import java.util.List;

/**
 * Created by lzq on 2018/3/22.
 * 抽象模板
 */
public abstract class AbstractCar {

    //模板方法的执行顺序
    private List<String> sequence;


    /*
     * 首先，这个模型要能发动起来，别管是手摇发动，还是电力发动，反正
     * 是要能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();

    //能发动，还要能停下来，那才是真本事
    protected abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();


    //模板方法 按给定的顺序执行相应的方法
    public void run() {
        for (String s : sequence) {
            if ("start".equalsIgnoreCase(s)) {

                this.start(); //先启动
            }
            if ("engine".equalsIgnoreCase(s)) {

                this.engineBoom(); //引擎吼一下，不然不是名车
            }
            if ("alarm".equalsIgnoreCase(s)) {

                this.alarm(); //遇到一条狗，按下喇叭
            }
            if ("stop".equalsIgnoreCase(s)) {

                this.stop(); //到达目的地，停车
            }
        }

    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
