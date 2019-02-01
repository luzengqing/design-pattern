package org.java.p08_mediator.improvement;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/26.
 */
public class Client {

    @Test
    public void t1() {

        /**
         * 使用中介者模式，
         *  三个模块都关联中介者，只负责处理自己的业务活动，与自己无关的都交由中介者处理
         *  加入了中介者，设计结构清晰了很多，而且类间的耦合性大大减少，代码质量也有了很大的提升
         */

        /**
         * 在多个对象依赖的情况下，通过加入中介者角色，
         * 取消了多个对象的关联或依赖关系，减少了对象的耦合性。
         */

        Mediator mediator = new Mediator1();

        Purchase purchase = new Purchase(mediator);

        Sale sale = new Sale(mediator);

        Stock stock = new Stock(mediator);

        purchase.buyIBMComputer(100);

        sale.sellIBMComputer(10);

        stock.clearStock();


        /**
         * 类之间的依赖关系是必然存在的，一个类依赖多个类的情况也是存在的，存在即合理，
         那是否可以说只要有多个依赖关系就考虑使用中介者模式呢？答案是否定的。中介者模式未
         必能帮你把原本凌乱的逻辑整理得清清楚楚，而且中介者模式也是有缺点的，这个缺点在使
         用不当时会被放大，比如原本就简单的几个对象依赖关系，如果为了使用模式而加入了中介
         者，必然导致中介者的逻辑复杂化，因此中介者模式的使用需要“量力而行”！中介者模式适
         用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构。在
         这种情况下一定要考虑使用中介者模式，这有利于把蜘蛛网梳理为星型结构，使原本复杂混
         乱的关系变得清晰简单。
         */
    }
}
