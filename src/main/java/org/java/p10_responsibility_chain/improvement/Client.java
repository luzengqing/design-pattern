package org.java.p10_responsibility_chain.improvement;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {


    @Test
    public void t1() {

        //随机产生几个状况的女性
        Random random = new Random();
        List<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        //定义三个请示对象
        IHandler father = new Father(HandlerConsts.FATHER_LEVEL);
        IHandler husband = new Husband(HandlerConsts.HUSBAND_LEVEL);
        IHandler son = new Son(HandlerConsts.SON_LEVEL);

        //设置责任链
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : list) {
            father.handleMessage(women);
        }

        /**
         * 业务调用类Client也不用去做判断到底是需要谁去处理，而且Handler抽象
         类的子类可以继续增加下去，只需要扩展责任链而已，调用类可以不用了解变化过程，甚至
         是谁在处理这个请求都不用知道
         */
    }
}
