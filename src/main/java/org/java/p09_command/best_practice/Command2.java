package org.java.p09_command.best_practice;

/**
 * Created by lzq on 2018/3/27.
 */
public class Command2 extends AbstractCommand {


    //提供默认的接收者
    public Command2() {
        super(new Receiver2());
    }

    public Command2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething1();
    }
}
