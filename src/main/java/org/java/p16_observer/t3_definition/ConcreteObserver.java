package org.java.p16_observer.t3_definition;

/**
 * Created by lzq on 2018/4/3.
 * 具体的观察者
 * 每个观察在接收到消息后的处理反应是不同，各个观察者有自己的处理逻辑
 */
public class ConcreteObserver implements Observer {


    @Override
    public void subscribe(String message) {
        System.out.println("观察者 ConcreteObserver收到的消息： "+message);
    }
}
