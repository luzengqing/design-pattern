package org.java.p09_command.improvement;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {

    /**
     * 命令模式是一个高内聚的模式
     * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化
     */

    @Test
    public void t1() {

        //客户要求增加一项需求
        System.out.println("------------客户要求增加一项需求---------------");

        //客户找到项目经理（负责人）
        Invoker invoker = new Invoker();

        //给负责人发出了一个添加需求的命令
        AbstractCommand command = new AddRequirementCommand();
        invoker.setCommand(command);

        //负责人给底下人员下达命令
        invoker.action();

    }

    @Test
    public void t2() {

        //客户要求删除一个页面
        System.out.println("------------客户要求删除一个页面---------------");

        //客户找到项目经理（负责人）
        Invoker invoker = new Invoker();

        //给负责人发出了一个删除页面的命令
        AbstractCommand command = new DeletePageCommand();
        invoker.setCommand(command);

        //负责人给底下人员下达命令
        invoker.action();

    }
}
