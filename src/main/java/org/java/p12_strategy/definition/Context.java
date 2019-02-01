package org.java.p12_strategy.definition;

/**
 * Created by lzq on 2018/3/29.
 * 上下文环境
 */
public class Context {

    //抽象策略，封装角色的目的是保证策略是可以相互替换
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //封装后的策略方法
    //高层模块的调用非常简单，知道要用哪个策略，产生出它的对象，然后放到封装角色中
    //就完成任务了
    public void doAnything() {
        this.strategy.doSomething();
    }
}
