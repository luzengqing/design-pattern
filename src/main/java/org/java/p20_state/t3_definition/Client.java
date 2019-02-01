package org.java.p20_state.t3_definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {


    @Test
    public void t() {

        //上下文
        Context context = new Context();

        //初始状态
        ConcreteState1 initState = new ConcreteState1();
//        ConcreteState2 initState = new ConcreteState2();

        //相互关联
        context.setCurrentState(initState);
        initState.setContext(context);

        context.behave1();

        context.behave2();

        /**
         * 我们只要定义一个初始状态，可以执行具体动作，屏蔽了状态变化的过程，是状态的变化引起动作的变化
         */
    }
}
