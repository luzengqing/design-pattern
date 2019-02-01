package org.java.p20_state.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 状态1
 */
public class ConcreteState1 extends AbstractState {


    //产生状态1的原因，动作
    @Override
    public void behave1() {
        System.out.println("产生状态1的动作行为。。。");
    }

    //状态1能转换到状态2
    @Override
    public void behave2() {

        //将上下文当前状态设置为状态2
        super.context.setCurrentState(Context.CONCRETE_STATE_2);

        //动作委托给上下文角色
        super.context.behave2();

        System.out.println("当前： 状态1 --> 状态2");
    }
}
