package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 具体中介者
 */
public class Mediator1 extends AbstractMediator {


    /**
     * 中介者的事件方法, 用于各同事角色之间的通信
     * @param behaviorEnum 行为
     * @param objects 参数
     */
    @Override
    public void execute(BehaviorEnum behaviorEnum, Object... objects) {
        if (BehaviorEnum.PURCHASE.equals(behaviorEnum)) {
            this.buyComputer((Integer) objects[0]);
        }
        if (BehaviorEnum.SALE.equals(behaviorEnum)) {
            this.sale((Integer) objects[0]);
        }
        if (BehaviorEnum.PROMOTION.equals(behaviorEnum)) {
            this.promotion();
        }
        if (BehaviorEnum.CLEAR_STOCK.equals(behaviorEnum)) {
            this.clear();
        }

    }


    /**
     * 中介者Mediator定义了多个private方法, 其目的是处理各个对象之间的依赖关系，就是
     说把原有一个对象要依赖多个对象的情况移到中介者的private方法中实现。在实际项目中，
     一般的做法是中介者按照职责进行划分，每个中介者处理一个或多个类似的关联请求。
     */

    //=====private methods=================


    private void buyComputer(int number) {
        //采购前，先去向销售部询问销售情况， 采购完还要通知库存部增加库存
        int saleStatus = this.sale.getSaleStatus();
        if (saleStatus > 80) {
            //销售情况极好
            System.out.println("采购IBM电脑:"+number + "台");
            this.stock.increase(number);
        } else {
            //销售情况不好
            int buyNumber = number / 2; //折半采购
            System.out.println("采购IBM电脑："+buyNumber+ "台");
            this.stock.increase(buyNumber);
        }
    }

    //销售电脑
    private void sale(int number) {
        //先向库存部询问库存数量，不够让采购部先去采购
        if(this.stock.getStockNumber() < number){
            this.purchase.buyIBMComputer(number);
        }
        //采购完进行销售
        System.out.println("销售IBM电脑"+number+"台");
        //销售完，通知库存减少
        this.stock.decrease(number);
    }

    //折价促销
    private void promotion() {
        System.out.println("折价销售IBM电脑"+this.stock.getStockNumber()+"台");
        //促销，库存部清除库存数量
        this.stock.decrease(this.stock.getStockNumber());
    }

    //清仓梳理
    private void clear() {
        System.out.println("清理存货数量为："+this.stock.getStockNumber());
        //先让销售部促销处理
        this.sale.offSale();
        //再通知采购部不再购买
        this.purchase.refuseBuyIBM();
    }
}
