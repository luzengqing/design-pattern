package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 */
public class OpeningState extends AbstractLiftState {


    public OpeningState(Context context) {
        super(context);
    }

    //Open状态是由open()这个动作产生的，有自己的业务逻辑，这里简单打印
    //这个就定义了open状态是怎么来的，
    @Override
    public void open() {
        System.out.println("电梯门开启了。。。");
    }

    //目前的定义，门开着，只能发生关门的动作
    //这个方法就说明了，open状态可以往哪去
    @Override
    public void close() {
        //先修改状态
        super.context.setLiftState(super.context.getClosingState());

        //再把关门这个动作委托给ClosingState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //门开着时电梯就运行跑，这电梯，吓死你！
    }

    @Override
    public void stop() {
        //门开着，已经停止了，啥事不做
    }
}
