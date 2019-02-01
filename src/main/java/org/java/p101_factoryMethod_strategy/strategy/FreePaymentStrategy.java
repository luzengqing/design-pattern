package org.java.p101_factoryMethod_strategy.strategy;

import org.java.p101_factoryMethod_strategy.Card;
import org.java.p101_factoryMethod_strategy.TradeDTO;

/**
 * Created by lzq on 2018/3/29.
 * 自由扣款策略
 */
public class FreePaymentStrategy implements PaymentStrategy {


    /**
     * 全部扣除自由的金额
     * @param card 支付使用的IC卡
     * @param tradeDTO 交易信息
     * @return
     */
    @Override
    public Card pay(Card card, TradeDTO tradeDTO) {
        System.out.println("自由扣款策略---------");
        double amount = tradeDTO.getTradeAmount();
        card.setFreeAmount(card.getFreeAmount() - amount);
        return card;
    }
}
