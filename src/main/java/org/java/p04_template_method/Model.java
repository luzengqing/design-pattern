package org.java.p04_template_method;

/**
 * Created by lzq on 2018/3/22.
 */
public interface Model {

    /**
     * 基本方法
     * 也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
     */
    void doSomething();

    //基本方法
    void say();

    /**
     * 模板方法
     * 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
     */
    void templateMethod();
}
