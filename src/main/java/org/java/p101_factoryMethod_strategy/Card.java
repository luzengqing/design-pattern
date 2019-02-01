package org.java.p101_factoryMethod_strategy;

/**
 * Created by lzq on 2018/3/29.
 * IC交易卡
 */
public class Card {

    /**
     * 卡号
     */
    private String cardNO;

    /**
     * 固定金额
     */
    private double constantAmount;

    /**
     * 自由金额
     */
    private double freeAmount;

    public String getCardNO() {
        return cardNO;
    }

    public void setCardNO(String cardNO) {
        this.cardNO = cardNO;
    }

    public double getConstantAmount() {
        return constantAmount;
    }

    public void setConstantAmount(double constantAmount) {
        this.constantAmount = constantAmount;
    }

    public double getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(double freeAmount) {
        this.freeAmount = freeAmount;
    }
}
