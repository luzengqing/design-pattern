package org.java.p101_factoryMethod_strategy.factory;

import org.java.p101_factoryMethod_strategy.PaymentStrategyEnum;
import org.java.p101_factoryMethod_strategy.strategy.PaymentStrategy;

/**
 * Created by lzq on 2018/3/29.
 * 策略工厂
 */
public class StrategyFactory {

    /**
     * 根据策略枚举产生相应的具体策略
     * @param paymentStrategyEnum
     * @return
     */
    public static PaymentStrategy getPaymentStrategy(PaymentStrategyEnum paymentStrategyEnum) {
        String value = paymentStrategyEnum.getValue();

        try {
            PaymentStrategy paymentStrategy = (PaymentStrategy) Class.forName(value).newInstance();
            return paymentStrategy;
        } catch (Exception e) {
            System.out.println("工厂初始化失败");
        }
        return null;
    }
}
