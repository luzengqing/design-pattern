package org.java.p04_template_method.extend;

/**
 * Created by lzq on 2018/3/22.
 */
public interface Model {

    //基本方法
    void say();

    void doSomething1();

    void doSomething2();

    void doSomething3();


    /**
     * 模板方法
     * 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
     */
    void templateMethod();


    //钩子方法，控制模板方法中的执行流程
    boolean hookFunction();
}
