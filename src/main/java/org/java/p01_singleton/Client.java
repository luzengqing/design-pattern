package org.java.p01_singleton;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lzq on 2018/3/21.
 */
public class Client {

    @Test
    public void t1() {
        //多次遇见的皇帝都是同一个人
        for (int i = 0; i < 5; i++) {
            Emperor emperor = Emperor.getEmperor();
            emperor.say();
        }
    }


    @Test
    public void t2() throws InterruptedException {
        //多线程获取皇帝
        CountDownLatch latch = new CountDownLatch(20);
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> {
                Emperor2 emperor2 = Emperor2.getEmperor2();
                emperor2.say();
                latch.countDown();
            });
            thread.start();
        }
        latch.await();
    }

}
