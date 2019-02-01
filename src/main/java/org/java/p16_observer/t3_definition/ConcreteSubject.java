package org.java.p16_observer.t3_definition;

/**
 * Created by lzq on 2018/4/3.
 * 具体的被观察者
 * 定义被观察者自己的业务逻辑，同时定义对哪些事件进行通知
 */
public class ConcreteSubject extends AbstractSubject {

    public void doSomething() {
        System.out.println("do something");
        //通知他自己的观察者们
        this.notifyObservers("hi, 我在做事");
    }
}

