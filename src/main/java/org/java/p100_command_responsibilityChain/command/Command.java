package org.java.p100_command_responsibilityChain.command;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.responsibility_chain.CommandHandler;

import java.util.List;

/**
 * Created by lzq on 2018/3/27.
 */
public interface Command {

    /**
     * 命令处理
     * @param commandDTO
     */
    void execute(CommandDTO commandDTO);

    /**
     * 形成责任链
     * @param commandDTO
     * @return
     */
    List<CommandHandler> buildChain(CommandDTO commandDTO);


}
