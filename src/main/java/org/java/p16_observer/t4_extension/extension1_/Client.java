package org.java.p16_observer.t4_extension.extension1_;

import org.junit.Test;

import java.util.Observer;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {


    @Test
    public void t1() {

        //拉出韩非子（被观察的）
        HanFeiZi hanFeiZi = new HanFeiZi();

        //观察者李斯
        Observer lisi = new Lisi();

        //让李斯成为韩非子的观察者
        hanFeiZi.addObserver(lisi);

        //韩非子开始吃饭
        hanFeiZi.haveBreakfast();
    }

}
