package org.java.p101_factoryMethod_strategy.strategy;

import org.java.p101_factoryMethod_strategy.Card;
import org.java.p101_factoryMethod_strategy.TradeDTO;

/**
 * Created by lzq on 2018/3/29.
 * 固定性扣款策略
 */
public class ConstantPaymentStrategy implements PaymentStrategy {

    /**
     * 该类型的消费分别在固定金额和自由金额上各扣除一半
     * @param card 支付使用的IC卡
     * @param tradeDTO 交易信息
     * @return
     */
    @Override
    public Card pay(Card card, TradeDTO tradeDTO) {
        System.out.println("固定扣款策略---------");
        double amount = tradeDTO.getTradeAmount() / 2.0;
        card.setConstantAmount(card.getConstantAmount() - amount);
        card.setFreeAmount(card.getFreeAmount() - amount);
        return card;
    }
}
