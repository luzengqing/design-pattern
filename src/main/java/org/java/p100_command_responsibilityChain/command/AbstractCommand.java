package org.java.p100_command_responsibilityChain.command;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.responsibility_chain.CommandHandler;

import java.util.List;

/**
 * Created by lzq on 2018/3/27.
 * 命令抽象类
 */
public abstract class AbstractCommand implements Command {

    //该命令处理的类型
    protected String commandType;

    public AbstractCommand(String commandType) {
        this.commandType = commandType;
    }

    /**
     * 模板方法
     * 根据命令参数，形成一条责任链，从链头开始，具体由哪个节点处理，执行者并不关心
     * @param commandDTO
     */
    @Override
    public void execute(CommandDTO commandDTO) {
        List<CommandHandler> chain = this.buildChain(commandDTO);
        chain.get(0).handleMessage(commandDTO);
    }


    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }
}
