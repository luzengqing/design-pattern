package org.java.p10_responsibility_chain.introduction;

/**
 * Created by lzq on 2018/3/27.
 * 父亲节点
 */
public class Father implements IHandler {


    //未出嫁的女儿来请示父亲
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
