package org.java.p19_visitor.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 */
public abstract class Element {

    //元素自己的业务逻辑
    protected abstract  void doSomething();

    //定义允许谁来访问我
    protected abstract void accept(IVisitor visitor);
}
