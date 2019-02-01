package org.java.p16_observer.t4_extension.extension2_;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lzq on 2018/4/4.
 */
public class MyObserver implements Observer {

    private ExecutorService executorService = Executors.newFixedThreadPool(4);


    @Override
    public void update(Observable o, Object arg) {
        //真实项目中，为了提供性能，可以使用多线程，异步处理消息
        executorService.submit( () -> {
            System.out.println(Thread.currentThread().getName()+ "收到的消息: "+arg);

        });
    }
}
