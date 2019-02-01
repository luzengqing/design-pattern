package org.java.p16_observer.t4_extension.extension1_;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lzq on 2018/4/3.
 * 观察者
 * 直接通过实现java.util包里的Observer接口，成为观察者，不需要自己再定义了
 */
public class Lisi implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕...\n");
    }
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
