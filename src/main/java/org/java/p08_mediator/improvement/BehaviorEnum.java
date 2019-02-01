package org.java.p08_mediator.improvement;

/**
 * Created by lzq on 2018/3/26.
 * 行为枚举
 */
public enum BehaviorEnum {

    PURCHASE("PURCHASE", "采购"),
    SALE("SALE", "销售"),
    PROMOTION("PROMOTION", "促销"),
    CLEAR_STOCK("CLEAR_STOCK", "清仓");

    private String code;
    private String name;


    BehaviorEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
