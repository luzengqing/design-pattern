package org.java.p101_factoryMethod_strategy.strategy;

import org.java.p101_factoryMethod_strategy.Card;
import org.java.p101_factoryMethod_strategy.TradeDTO;

/**
 * Created by lzq on 2018/3/29.
 */
public interface PaymentStrategy {

    /**
     * 支付扣款
     * @param card 支付使用的IC卡
     * @param tradeDTO 交易信息
     * @return ；支付完后的卡
     */
    Card pay(Card card, TradeDTO tradeDTO);
}
