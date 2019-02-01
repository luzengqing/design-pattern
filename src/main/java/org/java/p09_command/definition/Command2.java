package org.java.p09_command.definition;

/**
 * Created by lzq on 2018/3/27.
 * 某个具体的命令请求
 */
public class Command2 implements Command {

    //指定该命令由哪个人员负责
    private Receiver receiver;

    public Command2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //交由该接收者负责处理
        System.out.println("Command2 ==============");
        this.receiver.doSomething1();

        this.receiver.doSomething2();
    }
}
