package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 抽象中介者
 */
public abstract class AbstractMediator implements Mediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }
}
