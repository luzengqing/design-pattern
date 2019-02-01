package org.java.p16_observer.t3_definition;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/4/3.
 * 被观察者
 * 定义被观察者必须实现的职责，它必须能够动态地增加、取消观察者。它一般是抽象类
 或者是实现类，仅仅完成作为被观察者必须实现的职责：管理观察者并通知观察者。
 */
public abstract class AbstractSubject implements Observable {

    //定义一个观察者数组
    protected List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.subscribe(message);
        }
    }
}
