package org.java.p101_factoryMethod_strategy;

/**
 * Created by lzq on 2018/3/29.
 * 支付策略映射
 */
public enum PaymentStrategyEnum {

    //登记具体的策略，提供给工厂方法模式
    CONSTANT_PAY("ConstantPaymentStrategy"),
    FREE_PAY("FreePaymentStrategy");

    private String value;

    PaymentStrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
