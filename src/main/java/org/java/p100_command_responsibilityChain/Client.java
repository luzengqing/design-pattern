package org.java.p100_command_responsibilityChain;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {

    @Test
    public void t1() {

        //定义一个命令参数
        CommandDTO commandDTO = new CommandDTO(CommandEnum.GIT_CHECKOUT);

        //定义一个执行者
        Invoker invoker = new Invoker();

        invoker.action(commandDTO);

    }
}
