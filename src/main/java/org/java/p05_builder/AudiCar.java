package org.java.p05_builder;

/**
 * Created by lzq on 2018/3/22.
 */
public class AudiCar extends AbstractCar {

    /**
     * 子类实现父类的抽象的基本方法
     * 行为是由父类控制，具体实现还需要子类实现
     */

    @Override
    protected void start() {
        System.out.println("奥迪A6发动了，小心点。。。");    
    }

    @Override
    protected void stop() {
        System.out.println("奥迪A6停在路边了。。。");

    }

    @Override
    protected void alarm() {
        System.out.println("奥迪A6按了下喇叭，都这么霸气。。。");

    }

    @Override
    protected void engineBoom() {
        System.out.println("奥迪A6的引擎声，屌炸了。。。");

    }
}
