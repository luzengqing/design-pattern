package org.java.p20_state.t2_improvement.improve2_;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {

    @Test
    public void t1() {
        Context context = new Context();

        context.setLiftState(new OpeningState(context));
//        context.setLiftState(new RunningState(context));

//        context.open();
        context.run();
        context.close();
        context.stop();

        /**
         * 上下文屏蔽了状态的转换过滤，只看到行为发生变化
         */
    }
}
