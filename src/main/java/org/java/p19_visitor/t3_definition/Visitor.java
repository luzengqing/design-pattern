package org.java.p19_visitor.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 访问者
 */
public class Visitor implements IVisitor {


    //访问者放着元素，定义要干的事情
    @Override
    public void visit(ConcreteElement1 concreteElement) {
        concreteElement.doSomething();
        //还可以做一些其他的事情，任意的事情。。。。
    }

    @Override
    public void visit(ConcreteElement2 concreteElement) {
        concreteElement.doSomething();
    }
}
