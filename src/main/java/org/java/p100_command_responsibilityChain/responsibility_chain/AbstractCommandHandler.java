package org.java.p100_command_responsibilityChain.responsibility_chain;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.CommandEnum;

/**
 * Created by lzq on 2018/3/27.
 */
public abstract class AbstractCommandHandler implements CommandHandler {

    //自己能够处理的命令
    protected CommandEnum commandEnum;

    //自己的下一个责任人
    protected CommandHandler nextCommandHandler;


    public AbstractCommandHandler(CommandEnum commandEnum) {
        this.commandEnum = commandEnum;
    }

    /**
     * 处理和自己类型一致的命令请求
     * @param commandDTO
     */
    protected abstract void doEcho(CommandDTO commandDTO);

    @Override
    public void handleMessage(CommandDTO commandDTO) {
        if (this.commandEnum.equals(commandDTO.getCommandEnum())) {
            //处理和自己类型一致的命令
            this.doEcho(commandDTO);
        } else {
            if (this.nextCommandHandler != null) {
                //交由下一个责任人处理
                this.nextCommandHandler.handleMessage(commandDTO);
            } else {
                System.out.println("抱歉我["+this.getClass().getName()+"]无法处理");
            }
        }
    }

    @Override
    public void setNext(CommandHandler commandHandler) {
        this.nextCommandHandler = commandHandler;
    }
}
