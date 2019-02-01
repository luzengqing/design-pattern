package org.java.p16_observer.t2_improvement.improve1_;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {

    @Test
    public void t1() {
        //客户端简化了不少
        IHanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();

        /**
         * 韩非子类目前只能有李斯能观察，战国期间还有一大帮人要观察韩非子呐！
         * 这个严重不符合开闭原则，
         * 而且韩非子除了吃饭，娱乐，其他活动都要通知到观察他的人
         *
         * 继续改善：把李斯，王斯等等观察韩非子的人，抽象成观察者接口，
         * 把韩非子这样的人抽象成被观察者接口，当然，韩非子还有他自己的个性接口，
         * 被观察者可以有这样的行为： 添加观察者，删除观察者，有活动通知观察者
         */
    }
}
