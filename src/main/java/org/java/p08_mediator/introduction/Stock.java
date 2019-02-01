package org.java.p08_mediator.introduction;

/**
 * Created by lzq on 2018/3/26.
 * 库存管理
 */
public class Stock {

    private static int STOCK_NUMBER = 100;


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
    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为："+STOCK_NUMBER);
        //要求折价销售
        sale.offSale();
        //要求采购人员不要采购
        purchase.refuseBuyIBM();
    }
}
