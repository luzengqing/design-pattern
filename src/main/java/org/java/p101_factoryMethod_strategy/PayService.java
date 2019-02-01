package org.java.p101_factoryMethod_strategy;

import org.java.p101_factoryMethod_strategy.factory.StrategyFactory;
import org.java.p101_factoryMethod_strategy.strategy.PaymentContext;
import org.java.p101_factoryMethod_strategy.strategy.PaymentStrategy;

/**
 * Created by lzq on 2018/3/29.
 * 支付服务（用了门面模式）
 */
public class PayService {


    public Card doPay(Card card, TradeDTO tradeDTO) {
        //根据交易信息产生相应的枚举映射
        PaymentStrategyEnum paymentStrategyEnum = this.getPaymentStrategyEnum(tradeDTO);

        //从工厂从获取具体的策略
        PaymentStrategy paymentStrategy = StrategyFactory.getPaymentStrategy(paymentStrategyEnum);

        //封装上下文
        PaymentContext paymentContext = new PaymentContext(paymentStrategy);

        //进行扣款处理
        return paymentContext.executePay(card, tradeDTO);
    }

    /**
     * 根据交易信息获取策略枚举映射
     * @param tradeDTO
     * @return
     */
    public PaymentStrategyEnum getPaymentStrategyEnum(TradeDTO tradeDTO) {
        /**
         * 这边简单根据交易编号做判断的，
         * 实际项目中，应根据交易编号或者其他编号等等，去数据库中查找相应的策略映射，然后拿这个策略映射去工厂找到具体的策略
         */
        if (tradeDTO.getTradeNo().contains("abc")) {
            return PaymentStrategyEnum.CONSTANT_PAY;
        }
        return PaymentStrategyEnum.FREE_PAY;
    }
}
