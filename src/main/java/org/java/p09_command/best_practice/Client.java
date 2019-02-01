package org.java.p09_command.best_practice;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {


    //高层次的模块不需要知道接收者
    @Test
    public void t1() {
        Command command = new Command1();

        Invoker invoker = new Invoker(command);

        invoker.action();


    }
}
