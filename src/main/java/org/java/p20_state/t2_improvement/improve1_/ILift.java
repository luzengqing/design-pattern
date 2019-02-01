package org.java.p20_state.t2_improvement.improve1_;

/**
 * Created by lzq on 2018/4/6.
 * 电梯接口
 */
public interface ILift {

    //电梯的4个状态
    int OPENING_STATE = 1; //敞门状态
    int CLOSING_STATE = 2; //闭门状态
    int RUNNING_STATE = 3; //运行状态
    int STOPPING_STATE = 4; //停止状态

    //设置电梯的状态
    void setState(int state);

    //首先电梯门开启动作
    void open();
    //电梯门可以开启，那当然也就有关闭了
    void close();
    //电梯要能上能下
    void run();
    //电梯还要能停下来
    void stop();
}
