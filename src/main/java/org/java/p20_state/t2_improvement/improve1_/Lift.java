package org.java.p20_state.t2_improvement.improve1_;

/**
 * Created by lzq on 2018/4/6.
 * 电梯
 */
public class Lift implements ILift {


    /**
     * 下面分析状态与动作之间的关系
     *
     *              开门open      关门close     运行run       停止stop
     * 开门状态         ×             √            ×             ×
     * 关门状态         √             ×            √             √
     * 运行状态         ×             ×            ×             √
     * 停止状态         √             ×            √             ×
     */

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }


    //电梯门关闭
    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                //只有开启的状态才能关门，同时修改电梯状态
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //电梯是关门状态，则什么都不做
                break;
            case RUNNING_STATE:
                //运行状态下，门是关着的，什么也不做
                break;
            case STOPPING_STATE:
                //停止状态下，门是关着的，什么也不做
                break;
        }
    }

    //电梯门开启
    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                //门开着了，不能再开门了，啥也不做
                break;
            case CLOSING_STATE:
                //关门状态下，可以开门
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //运行状态下，不能开门，想死啊
                break;
            case STOPPING_STATE:
                //停止状态下，可以开门
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }
    //电梯开始运行起来
    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                //门开着了，不能运行
                break;
            case CLOSING_STATE:
                //关门状态下，可以开门
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //已经在运行状态下了，啥事不做
                break;
            case STOPPING_STATE:
                //停止状态下，可以开门
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }
    //电梯停止
    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                //门开着了，不能停止
                break;
            case CLOSING_STATE:
                //关门状态下，可以停止
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                //有运行了，就能停止
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //停止状态下，不能再停止了
                break;
        }
    }


    //增加4个私有的方法，没有任何逻辑的执行，也就是说没有任何前置条件，因此私有
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }
    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
