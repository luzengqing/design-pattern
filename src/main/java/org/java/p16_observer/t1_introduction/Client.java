package org.java.p16_observer.t1_introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {


    @Test
    public void t1() throws InterruptedException {
        //定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        //观察早餐
        Spy watchBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
        //开始启动线程，监控
        new Thread(watchBreakfast).start();
        //观察娱乐情况
        Spy watchFun = new Spy(hanFeiZi,liSi,"fun");
        new Thread(watchFun).start();

        //然后我们看看韩非子在干什么
        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
        //韩非子娱乐了
        Thread.sleep(1000);
    }
}
