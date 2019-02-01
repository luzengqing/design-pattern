package org.java.p16_observer.t1_introduction;

/**
 * Created by lzq on 2018/4/3.
 * 韩非子（被观察）
 */
public class HanFeiZi implements IHanFeiZi {

    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHavingBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHavingFun = false;

    //韩非子要吃饭了
    @Override
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        this.isHavingBreakfast =true;
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
