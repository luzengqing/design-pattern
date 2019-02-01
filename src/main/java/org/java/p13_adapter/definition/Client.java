package org.java.p13_adapter.definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/3.
 */
public class Client {


    @Test
    public void t1() {
        //原有的业务逻辑
        Target target1 = new ConcreteTarget();
        target1.request();

        //现增加适配器角色后的逻辑
        Target adapter = new Adapter();
        adapter.request();

    }
}
