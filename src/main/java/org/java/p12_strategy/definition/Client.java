package org.java.p12_strategy.definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/29.
 */
public class Client {

    /**
     * 它就是采用了面向对象的继承和多态机制
     * 通过封装角色对其进行封装，保证对外提供“可自由切换”的策略。
     */

    /**
     * 策略模式的缺点：
     * 1.每一个策略都是一个类，复用的可能性很小，类数量增多。
     * 2.所有的策略类都需要对外暴露，上层模块必须知道有哪些策略，然后才能决定使用哪一个策略
     * 这是原装策略模式的一个缺点，幸运的是，我们可以使用其他模式来修正这个缺陷，
     如工厂方法模式、代理模式或享元模式。
     */

    @Test
    public void t1() {
        //声明一个具体的策略
        IStrategy strategy = new Strategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
