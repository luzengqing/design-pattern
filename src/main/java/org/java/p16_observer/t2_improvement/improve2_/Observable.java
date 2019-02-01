package org.java.p16_observer.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/3.
 * 被观察者接口
 */
public interface Observable {

    //添加自己的观察者
    void addObserver(Observer observer);

    //删除自己的观察者
    void deleteObserver(Observer observer);

    //向自己的观察者们发出通知消息
    void notifyObservers(String message);
}
