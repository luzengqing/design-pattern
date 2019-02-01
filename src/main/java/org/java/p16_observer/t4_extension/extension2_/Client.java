package org.java.p16_observer.t4_extension.extension2_;

import java.util.Observer;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {


    public static void main(String[] args) throws InterruptedException {
        Source source = new Source();
        Observer observer = new MyObserver();
        //注册观察者
        source.addObserver(observer);

        //模拟多线程并发调用同一个事情
        for (int i = 0; i < 10; i++) {
            new Thread(source::doSomething, "线程-"+i).start();
        }

        Thread.sleep(30000);
    }
}
