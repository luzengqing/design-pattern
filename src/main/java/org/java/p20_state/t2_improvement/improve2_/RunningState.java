package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 * 运行状态
 */
public class RunningState extends AbstractLiftState {


    public RunningState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        //电梯运行着，你想开门？？
    }

    @Override
    public void close() {
        //电梯运行着，门肯定关着的

    }

    //电梯运行状态产生的地方
    @Override
    public void run() {
        System.out.println("电梯在运行了。。。");
    }

    //电梯运行时，接下来可以发生停止stop的动作
    @Override
    public void stop() {
        //修改状态
        super.context.setLiftState(super.context.getStoppingState());
        //执行动作
        super.context.stop();
    }
}
