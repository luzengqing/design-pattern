package org.java.p10_responsibility_chain.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public class Husband extends AbstractHandler {

    public Husband(int level) {
        super(level);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }

}
