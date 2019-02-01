package org.java.p18_memo.t4_extension.extension1_clone;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {

    @Test
    public void t() {
        //定义发起人
        Originator originator = new Originator();

        //建立初始状态
        originator.setState("初始状态...");
        System.out.println("初始状态是："+originator.getState());

        //建立备份
        originator.createMemo();

        //修改状态
        originator.setState("修改后的状态...");
        System.out.println("修改后状态是："+originator.getState());

        //恢复原有状态
        originator.restoreMemo();
        System.out.println("恢复后状态是："+originator.getState());

        /**
         * 使用Clone方式的备忘录模式，可以使用在比较简单的场景或者比较单一的场景
         中，尽量不要与其他的对象产生严重的耦合关系。
         */
    }
}
