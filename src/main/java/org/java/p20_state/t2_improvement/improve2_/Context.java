package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 * 环境角色
 * 封装各种状态的变化引起的功能变化, 串联各个状态的过渡，
 */
public class Context {


    //定义出所有的电梯状态
    private final OpeningState openingState = new OpeningState(this);
    private final ClosingState closingState = new ClosingState(this);
    private final RunningState runningState = new RunningState(this);
    private final StoppingState stoppingState = new StoppingState(this);


    //定义一个当前电梯状态
    private ILiftState liftState;

    public ILiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(ILiftState liftState) {
        this.liftState = liftState;
    }


    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

    public OpeningState getOpeningState() {
        return openingState;
    }

    public ClosingState getClosingState() {
        return closingState;
    }

    public RunningState getRunningState() {
        return runningState;
    }

    public StoppingState getStoppingState() {
        return stoppingState;
    }
}
