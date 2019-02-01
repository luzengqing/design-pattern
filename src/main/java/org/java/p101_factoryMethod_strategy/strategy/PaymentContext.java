package org.java.p101_factoryMethod_strategy.strategy;

import org.java.p101_factoryMethod_strategy.Card;
import org.java.p101_factoryMethod_strategy.TradeDTO;

/**
 * Created by lzq on 2018/3/29.
 * 支付策略上下文（用于封装策略类，避免高层模块直接深入策略类内部）
 */
public class PaymentContext {

    //扣款策略
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    //执行扣款
    public Card executePay(Card card, TradeDTO tradeDTO) {
        return this.paymentStrategy.pay(card, tradeDTO);
    }
}
