package org.java.p09_command.definition;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {

    @Test
    public void t1() {

        //命令的接收者
        Receiver receiver = new Receiver1();

        //定义命令1，指定具体接收人
        Command command = new Command1(receiver);

        //负责人
        Invoker invoker = new Invoker(command);

        //负责人接收到客户命令，下达命令
        invoker.action();


    }
}
