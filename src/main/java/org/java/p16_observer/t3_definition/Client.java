package org.java.p16_observer.t3_definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {

    @Test
    public void t1() {

        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //定义一个观察者
        Observer observer= new ConcreteObserver();
        //观察者观察被观察者
        subject.addObserver(observer);
        //观察者开始活动了
        subject.doSomething();


        /**
         * 观察者模式的注意事项
         * 1.广播链的问题
         * 根据经验建议，在一个观察者模式中
         最多出现一个对象既是观察者也是被观察者，也就是说消息最多转发一次（传递两次），这
         还是比较好控制的。
         它和责任链模式的最大区别就是观察者广播链在传播的过程中消息是随时更改
         的，它是由相邻的两个节点协商的消息结构；而责任链模式在消息传递过程中基本上保持消
         息不可变，如果要改变，也只是在原有的消息上进行修正。

         2.异步处理问题
         被观察者发生动作了，观察者要做出回应，如果观察者
         比较多，而且处理时间比较长怎么办？那就用异步呗，异步处理就要考虑线程安全和队列的
         问题
         */
    }
}
