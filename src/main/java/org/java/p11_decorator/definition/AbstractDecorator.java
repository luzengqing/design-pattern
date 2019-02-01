package org.java.p11_decorator.definition;

/**
 * Created by lzq on 2018/3/29.
 * 抽象装饰类
 */
public abstract class AbstractDecorator extends AbstractComponent {

    //修饰的组件
    protected AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void action() {
        this.component.action();
    }
}
