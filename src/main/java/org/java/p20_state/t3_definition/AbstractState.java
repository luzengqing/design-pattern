package org.java.p20_state.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 抽象状态类
 * 每个状态要完成两个职责：
 * 1.定义产生自身状态的原因，也就是产生自身状态的逻辑
 * 2.定义在自身状态下能过渡的状态，以及相应的逻辑
 */
public abstract class AbstractState {

    //提供一个环境变量，提供给子类访问
    protected Context context;


    //行为1
    public abstract void behave1();

    //行为2
    public abstract void behave2();


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
