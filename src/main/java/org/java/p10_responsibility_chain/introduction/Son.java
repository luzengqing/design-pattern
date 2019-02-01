package org.java.p10_responsibility_chain.introduction;

/**
 * Created by lzq on 2018/3/27.
 * 儿子节点
 */
public class Son implements IHandler {


    //母亲向儿子
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
