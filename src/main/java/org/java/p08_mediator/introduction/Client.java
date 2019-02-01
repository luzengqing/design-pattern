package org.java.p08_mediator.introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/26.
 */
public class Client {

    @Test
    public void t1() {

        /**
         * 三个不同类型的参与者完成了各自的活动。你有没有发现这
         三个类是彼此关联的？每个类都与其他两个类产生了关联关系

            改进方案： 中介者模式，加入了一个中介者作为三个模块的交流核心，每个模块之间不再相互交流，要交流就通
         过中介者进行。每个模块只负责自己的业务逻辑，不属于自己的则丢给中介者来处理，简化
         了各模块之间的耦合关系
         */

        Purchase purchase = new Purchase();

        Sale sale = new Sale();

        Stock stock = new Stock();

        //采购部采购电脑
        purchase.buyIBMComputer(100);

        //销售部销售电脑
        sale.sellIBMComputer(10);

        //库存部清仓处理
        stock.clearStock();

    }
}
