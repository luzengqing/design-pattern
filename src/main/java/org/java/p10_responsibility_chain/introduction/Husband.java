package org.java.p10_responsibility_chain.introduction;

/**
 * Created by lzq on 2018/3/27.
 * 丈夫节点
 */
public class Husband implements IHandler {


    //妻子想丈夫请示
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
