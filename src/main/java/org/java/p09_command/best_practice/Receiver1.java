package org.java.p09_command.best_practice;

/**
 * Created by lzq on 2018/3/27.
 * 接收者（接收到命令，负责干活的人）
 */
public class Receiver1 implements Receiver {


    @Override
    public void doSomething1() {
        System.out.println("Receiver1 doSomething1");
    }

}
