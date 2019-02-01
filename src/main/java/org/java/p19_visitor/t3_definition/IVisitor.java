package org.java.p19_visitor.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 访问者接口
 */
public interface IVisitor {

    //允许访问元素1
    void visit(ConcreteElement1 concreteElement);


    //允许访问元素2
    void visit(ConcreteElement2 concreteElement);
}
