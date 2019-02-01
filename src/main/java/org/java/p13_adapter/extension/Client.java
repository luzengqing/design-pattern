package org.java.p13_adapter.extension;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {

    @Test
    public void t1() {
        //原有逻辑
        Target target = new ConcreteTarget();
        target.doSomething1();
        target.doSomething2();

        //使用适配器后的逻辑
        Source1 source1 = new Source1();
        Source2 source2 = new Source2();
        Target adapter = new Adapter(source1, source2);

        adapter.doSomething1();
        adapter.doSomething2();

    }
}
