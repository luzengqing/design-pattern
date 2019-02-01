package org.java.p11_decorator.definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/29.
 */
public class Client {


    @Test
    public void t1() {


        /**
         * 装饰模式是对继承的有力补充。我们看装饰类Decorator，不管装饰多少层，返
         回的对象还是Component。

         装饰模式还有一个非常好的优点：扩展性非常好。继承是静态地给类增加功能，而装饰模式则是动态地增加功能。
         通过装饰模式重新封装一个类，而不是通过继承来完成，
         */


        //原始的组件
        AbstractComponent component = new Component1();

        //第一次修饰
        AbstractDecorator decorator = new Decorator1(component);

        //第二次修饰
        decorator = new Decorator2(component);

        //修饰后运行
        decorator.action();
    }
}
