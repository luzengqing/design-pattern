package org.java.p19_visitor.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 */
public class ConcreteElement2 extends Element {

    @Override
    protected void doSomething() {
        System.out.println("ConcreteElement2 doSomething");
    }

    @Override
    protected void accept(IVisitor visitor) {

        //将自身传递给访问者，让她来访问本身这个对象
        visitor.visit(this);
    }
}
