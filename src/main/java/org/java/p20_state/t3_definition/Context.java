package org.java.p20_state.t3_definition;

/**
 * Created by lzq on 2018/4/6.
 * 上下文角色，管理各个状态的转换过渡
 */
public class Context {


    /**
     * 环境角色有两个不成文的约束：
     * ● 把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。
     * ● 环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。
     */

    //所有的状态
    public static final ConcreteState1 CONCRETE_STATE_1 = new ConcreteState1();
    public static final ConcreteState2 CONCRETE_STATE_2 = new ConcreteState2();


    //上下文中当前的状态
    private AbstractState currentState;


    //行为委托
    public void behave1() {
        this.currentState.behave1();
    }

    public void behave2() {
        this.currentState.behave2();
    }


    public AbstractState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        //将当前的状态关联上下文
        this.currentState.setContext(this);
    }
}
