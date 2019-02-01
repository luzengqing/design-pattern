package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 库存管理
 */
public class Stock extends AbstractColleague {

    private static int STOCK_NUMBER = 100;

    public Stock(Mediator broker) {
        super(broker);
    }


    //自有方法，只改变自身状态，不依赖别人
    //库存增加
    public void increase(int number){
        STOCK_NUMBER = STOCK_NUMBER + number;
        System.out.println("库存数量为："+STOCK_NUMBER);
    }
    //库存降低
    public void decrease(int number){
        STOCK_NUMBER = STOCK_NUMBER - number;
        System.out.println("库存数量为："+STOCK_NUMBER);
    }
    //获得库存数量
    public int getStockNumber(){
        return STOCK_NUMBER;
    }


    //存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
    //依赖方法， 通过中介者完成
    public void clearStock(){
        this.mediator.execute(BehaviorEnum.CLEAR_STOCK);
    }
}
