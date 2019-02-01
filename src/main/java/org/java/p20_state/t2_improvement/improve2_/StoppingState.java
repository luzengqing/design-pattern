package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 */
public class StoppingState extends AbstractLiftState {


    public StoppingState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        //修改状态
        super.context.setLiftState(super.context.getOpeningState());
        //执行动作
        super.context.open();
    }

    @Override
    public void close() {
        //停止状态关门？电梯门本来就是关着的！
    }

    @Override
    public void run() {
        //修改状态
        super.context.setLiftState(super.context.getRunningState());
        //执行动作
        super.context.run();
    }

    //停止状态是怎么发生的呢？当然是停止方法执行了
    //停止状态，产生的原因
    @Override
    public void stop() {
        System.out.println("电梯停下来了，。。。");
    }
}
