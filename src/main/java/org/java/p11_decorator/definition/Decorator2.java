package org.java.p11_decorator.definition;

/**
 * Created by lzq on 2018/3/29.
 * 装饰类2
 */
public class Decorator2 extends AbstractDecorator {

    public Decorator2(AbstractComponent component) {
        super(component);
    }

    //美化方法
    private void doSomething() {
        System.out.println("Decorator2 美化的方法");
    }

    @Override
    public void action() {
        super.action();
        this.doSomething();
    }
}
