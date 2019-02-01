package org.java.p16_observer.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/3.
 * 观察者接口
 */
public interface Observer {

    //接收来自被观察者的消息
    void subscribe(String message);
}
