package org.java.p16_observer.t4_extension.extension1_;

import java.util.Observable;

/**
 * Created by lzq on 2018/4/3.
 * 韩非子（被观察）
 * 直接继承java.util里的Observable，作为被观察者，不需要自己再写
 */
public class HanFeiZi extends Observable implements IHanFeiZi {


    //韩非子要吃饭了
    @Override
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        //改变状态通知观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        //改变状态通知李斯
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }

}
