package org.java.p09_command.best_practice;

/**
 * Created by lzq on 2018/3/27.
 */
public class Command1 extends AbstractCommand {

    public Command1() {
        //提供一个默认的接收者
        super(new Receiver1());
    }

    public Command1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething1();
    }
}
