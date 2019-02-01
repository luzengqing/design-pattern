package org.java.p11_decorator.definition;

/**
 * Created by lzq on 2018/3/29.
 * 装饰类1
 */
public class Decorator1 extends AbstractDecorator {

    public Decorator1(AbstractComponent component) {
        super(component);
    }

    //美化方法
    private void doSomething() {
        System.out.println("Decorator1 美化的方法");
    }

    @Override
    public void action() {
        this.doSomething();
        super.action();
    }
}
