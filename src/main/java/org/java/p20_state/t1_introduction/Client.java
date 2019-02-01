package org.java.p20_state.t1_introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {

    @Test
    public void t() {
        ILift lift = new Lift();
        //首先是电梯门开启，人进去
        lift.open();
        //然后电梯门关闭
        lift.close();
        //再然后，电梯运行起来，向上或者向下
        lift.run();
        //最后到达目的地，电梯停下来
        lift.stop();


        /**
         * 上面问题： 电梯的门可以打开，但不是随时都可以打开的，运行状态下怎么打开门？也就是打开这个动作是有前提条件的
         * 又如门不处于关闭的情况下怎么运行？
         * 电梯的这4个动作的执行都有前置条件，具体点说就是在特定状态下才能做特定事
         *
         *
         * 下面分析状态与动作之间的关系
         *
         *              开门open      关门close     运行run       停止stop
         * 开门状态         ×             √            ×             ×
         * 关门状态         √             ×            √             √
         * 运行状态         ×             ×            ×             √
         * 停止状态         √             ×            √             ×
         */
    }
}
