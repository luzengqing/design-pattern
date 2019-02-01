package org.java.p09_command.best_practice;


/**
 * Created by lzq on 2018/3/27.
 * 负责人（接收命令，传达给底下的接收者）
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }


    //接收到命令，下达命令
    public void action() {
       this.command.execute();
    }



    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
