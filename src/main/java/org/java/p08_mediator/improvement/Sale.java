package org.java.p08_mediator.improvement;

import java.util.Random;

/**
 * Created by lzq on 2018/3/26.
 */
public class Sale extends AbstractColleague {


    public Sale(Mediator broker) {
        super(broker);
    }

    //依赖方法， 必须要通过中介者完成
    public void sellIBMComputer(int number){
        //交由中介者去处理，去联系其他关联的模块
        this.mediator.execute(BehaviorEnum.SALE, number);
    }

    ///依赖方法， 必须要通过中介者完成
    public void offSale(){

        this.mediator.execute(BehaviorEnum.PROMOTION);
    }

    //自有方法
    //反馈销售情况，0～100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }



}
