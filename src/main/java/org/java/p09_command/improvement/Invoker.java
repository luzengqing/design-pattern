package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 * 负责人
 */
public class Invoker {

    //告诉项目经理（负责人）是什么命令
    private AbstractCommand command;

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    //给相关人员下达命令
    public void action() {
        this.command.execute();
    }
}
