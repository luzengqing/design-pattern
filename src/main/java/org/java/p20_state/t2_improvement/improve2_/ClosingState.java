package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 * 关闭状态
 */
public class ClosingState extends AbstractLiftState {


    public ClosingState(Context context) {
        super(context);
    }

    //关门状态下，可以开门
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(super.context.getOpeningState());

        //开门的动作委托给Opening状态来做
        super.context.getLiftState().open();

    }

    //这是关闭状态的由来（产生原因，怎么触发产生的）
    @Override
    public void close() {
        System.out.println("电梯关门了。。。");
    }

    @Override
    public void run() {
        //状态修改
        super.context.setLiftState(super.context.getRunningState());

        //运行的动作委托给RunningState状态来做
        super.context.getLiftState().run();

    }

    @Override
    public void stop() {
        //状态修改
        super.context.setLiftState(super.context.getStoppingState());

        //停止的动作委托给OStoppingState状态来做
        super.context.getLiftState().stop();

    }
}
