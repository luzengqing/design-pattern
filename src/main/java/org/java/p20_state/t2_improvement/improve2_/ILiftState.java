package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 * 电梯状态接口
 */
public interface ILiftState {

    //首先电梯门开启动作
    void open();
    //电梯门可以开启，那当然也就有关闭了
    void close();
    //电梯要能上能下
    void run();
    //电梯还要能停下来
    void stop();
}
