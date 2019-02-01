package org.java.p10_responsibility_chain.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public class Son extends AbstractHandler {

    public Son(int level) {
        super(level);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是:同意");
    }

}
