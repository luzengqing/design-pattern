package org.java.p16_observer.t1_introduction;

/**
 * Created by lzq on 2018/4/3.
 * 李斯的间谍（负责监控韩非子）
 */
public class Spy implements Runnable {

    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    //通过构造函数传递参数，我要监控的是谁，谁来监控，要监控什么
    public Spy(HanFeiZi _hanFeiZi,LiSi _liSi,String _type){
        this.hanFeiZi =_hanFeiZi;
        this.liSi = _liSi;
        this.type = _type;
    }

    @Override
    public void run() {
        //这边死循环，容易造成死机。后续改进
        while(true){
            if(this.type.equals("breakfast")){ //监控是否在吃早餐
                    //如果发现韩非子在吃饭，就通知李斯
                if(this.hanFeiZi.isHavingBreakfast()){
                    this.liSi.update("韩非子在吃饭");
                    //重置状态，继续监控
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            }else{//监控是否在娱乐
                if(this.hanFeiZi.isHavingFun()){
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
