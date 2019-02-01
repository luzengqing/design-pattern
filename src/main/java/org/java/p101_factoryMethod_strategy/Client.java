package org.java.p101_factoryMethod_strategy;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/29.
 */
public class Client {


    @Test
    public void t1() {
        Card card = this.initCard();
        TradeDTO tradeDTO = this.getTradeDTO();

        System.out.println("初始化信息============================");
        this.showCardInfo(card);
        this.showTradeInfo(tradeDTO);

        //高层模块直接调用支付方法，具体扣款策略不用管
        PayService payService = new PayService();
        payService.doPay(card, tradeDTO);

        System.out.println("交易完信息=========================");
        this.showCardInfo(card);
    }



    public void showCardInfo(Card card) {
        System.out.println("IC卡号："+card.getCardNO());
        System.out.println("固定金额："+card.getConstantAmount());
        System.out.println("自由金额："+card.getFreeAmount());
    }

    public void showTradeInfo(TradeDTO tradeDTO) {
        System.out.println("交易流水号："+tradeDTO.getTradeNo());
        System.out.println("交易金额："+tradeDTO.getTradeAmount());
    }


    public Card initCard() {
        Card card = new Card();
        card.setCardNO("12343546565");
        card.setConstantAmount(10000);
        card.setFreeAmount(5000);
        return card;
    }

    public TradeDTO getTradeDTO() {
        TradeDTO tradeDTO = new TradeDTO();
        tradeDTO.setTradeNo("abcfd32556");
        tradeDTO.setTradeAmount(800);
        return tradeDTO;
    }



    /**
     * 根据交易信息获取策略枚举映射
     * @param tradeDTO
     * @return
     */
    public PaymentStrategyEnum getPaymentStrategyEnum(TradeDTO tradeDTO) {
        if (tradeDTO.getTradeNo().contains("abc")) {
            return PaymentStrategyEnum.CONSTANT_PAY;
        }
        return PaymentStrategyEnum.FREE_PAY;
    }
}
