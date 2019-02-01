package org.java.p20_state.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/6.
 * 抽象电梯状态类
 */
public abstract class AbstractLiftState implements ILiftState {

    //环境角色，封装状态的变化而引起的动作变化
    protected Context context;

    public AbstractLiftState(Context context) {
        this.context = context;
    }
}
