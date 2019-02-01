package org.java.p09_command.best_practice;

/**
 * Created by lzq on 2018/3/27.
 */
public abstract class AbstractCommand implements Command {

    //该子类共享一个接收者
    protected final Receiver receiver;

    //强制要求子类必须初始化一个接收者
    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
