package org.java.p10_responsibility_chain.definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {


    @Test
    public void t1() {

        //定义一个请求
        Level level1 = new Level(1);
        Level level2 = new Level(2);
        Level level3 = new Level(3);
        Request request = new Request(level1);

        //定义处理请求的节点
        IHandler handler1  = new ConcreteHandler1(level1);
        IHandler handler2  = new ConcreteHandler1(level2);
        IHandler handler3  = new ConcreteHandler1(level3);

        //设置责任链
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        //处理请求,返回结果
        Response response = handler1.handleRequest(request);


        /**
         * 在实际应用中，一般会有一个封装类对责任模式进行封装，也就是替代Client类，直接
         返回链中的第一个处理者，具体链的设置不需要高层次模块关系，这样，更简化了高层次模
         块的调用，减少模块间的耦合，提高系统的灵活性。
         */

        /**
         * 责任链模式非常显著的优点是将请求和处理分开。请求者可以不用知道是谁处理的，处
         理者可以不用知道请求的全貌，两者解耦，提高系统的灵活性。
         链中节点数量需要控制，避免出现超长链的情况，一般的做法是在Handler中设置一个
         最大节点数量
         */

    }
}
