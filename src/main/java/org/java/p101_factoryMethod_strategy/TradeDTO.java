package org.java.p101_factoryMethod_strategy;

/**
 * Created by lzq on 2018/3/29.
 * 交易类数据对象
 */
public class TradeDTO {

    /**
     * 交易编号
     */
    private String tradeNo;

    /**
     *
     */
    private double tradeAmount;

    public TradeDTO() {
    }

    public TradeDTO(String tradeNo, double tradeAmount) {
        this.tradeNo = tradeNo;
        this.tradeAmount = tradeAmount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }
}
