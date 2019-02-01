package org.java.p20_state.t2_improvement.improve1_;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {

    @Test
    public void t() {
        ILift lift = new Lift();

        //设置电梯的初始状态，不同的状态能做的动作也不相同
        lift.setState(ILift.CLOSING_STATE);
//        lift.setState(ILift.OPENING_STATE);
//        lift.setState(ILift.RUNNING_STATE);
//        lift.setState(ILift.STOPPING_STATE);
        //首先是电梯门开启，人进去
        lift.open();
        //然后电梯门关闭
        lift.close();
        //再然后，电梯运行起来，向上或者向下
        lift.run();
        //最后到达目的地，电梯停下来
        lift.stop();


        /**
         * 问题：
         * 虽然现在每个动作加上了前置条件判断了，但：
         * 1.电梯实现类代码太长，有大量的switch-case（或者if-else）逻辑判断代码块，无法带来较好的维护性
         * 2.扩展性差，如果再加两个状态，通电状态，断电状态，那么这所以的方法是不是都要进行修改了，不符合开闭原则
         * 3.非常规状态无法实现，比如电梯门开着，也是可以运行的等等？这样再考虑特殊情况下，判断是不是要更复杂了？
         * 不符合单一职责原则，一个小功能的增加或修改，带来整个实现类的改动，风险太大
         */

        /**
         * 解决：
         * 换个角度思考：前面是考虑一个动作需要什么状态条件
         * 现在考虑电梯处于某个状态下，能够做什么事？
         * 也就是思考电梯处于某个状态时，这个是由谁触发产生的？在这个状态下还能够做什么事情？
         * 抽象点也就是思考：某个状态是怎么来的？接下来又可以往哪去？
         *
         * 好，以状态为参考模型，进行封装
         */
    }
}
