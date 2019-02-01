package org.java.p20_state.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 状态2
 */
public class ConcreteState2 extends AbstractState {


    //状态2能转换到状态1
    @Override
    public void behave1() {

        //将上下文当前状态设置为状态1
        super.context.setCurrentState(Context.CONCRETE_STATE_1);

        //动作委托给上下文角色
        super.context.behave1();

        System.out.println("当前： 状态2 --> 状态1");
    }

    //产生状态2的原因，动作
    @Override
    public void behave2() {
        System.out.println("产生状态2的动作行为。。。");
    }

}
