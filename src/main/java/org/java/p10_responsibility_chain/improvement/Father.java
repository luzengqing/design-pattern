package org.java.p10_responsibility_chain.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public class Father extends AbstractHandler {

    //通过构造函数，初始化自己的处理能力
    public Father(int level) {
        super(level);
    }

    //自己对女性做出响应
    //基本方法
    @Override
    public void response(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是:同意");
    }


}
