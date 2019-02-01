package org.java.p16_observer.t2_improvement.improve2_;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/4/3.
 */
public class HanFeiZi implements IHanFeiZi, Observable {

    private List<Observer> observerList;


    public HanFeiZi(List<Observer> observerList) {
        this.observerList = observerList;
    }

    //韩非子要吃饭了
    @Override
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        //通知所有观察者
        this.notifyObservers("韩非子在吃饭");
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        if (this.observerList == null) {
            this.observerList = new ArrayList<>();
        }
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (this.observerList == null) {
            this.observerList = new ArrayList<>();
        }
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observerList) {
            observer.subscribe(message);
        }
    }
}
