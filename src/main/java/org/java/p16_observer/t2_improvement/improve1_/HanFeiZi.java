package org.java.p16_observer.t2_improvement.improve1_;

/**
 * Created by lzq on 2018/4/3.
 * 韩非子（被观察）
 */
public class HanFeiZi implements IHanFeiZi {

    //韩非子类引入李斯，有活动就立马通知李斯
    private ILiSi liSi = new LiSi();

    //韩非子要吃饭了
    @Override
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        //通知李斯
        this.liSi.update("韩非子在吃饭");
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        //通知李斯
        this.liSi.update("韩非子在娱乐");
    }

}
