package org.java.p16_observer.t3_definition;

/**
 * Created by lzq on 2018/4/3.
 * 观察者接口
 */
public interface Observer {

    //观察者接收到消息后, 对接收到的信息进行处理
    void subscribe(String message);
}
