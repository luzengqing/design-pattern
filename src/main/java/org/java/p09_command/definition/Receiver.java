package org.java.p09_command.definition;

/**
 * Created by lzq on 2018/3/27.
 * 接收者（接收到命令，负责干活的人）
 */
public interface Receiver {

    //处理一定的业务逻辑
    void doSomething1();

    void doSomething2();

}
