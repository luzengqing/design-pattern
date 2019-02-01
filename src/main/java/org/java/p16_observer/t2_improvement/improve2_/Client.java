package org.java.p16_observer.t2_improvement.improve2_;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {


    @Test
    public void t1() {

        //被观察的韩非子
        HanFeiZi hanfeizi = new HanFeiZi(new ArrayList<>());

        //观察韩非子的各种小人
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();

        //实施监控
        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(wangsi);

        //韩非子开始活动了
        hanfeizi.haveBreakfast();
        hanfeizi.haveFun();


    }
}
