package org.java.p100_command_responsibilityChain.responsibility_chain;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.CommandEnum;

/**
 * Created by lzq on 2018/3/27.
 * 一个命令族的责任链上的一个处理节点
 */
public class GitStatusCommandHandler extends AbstractCommandHandler {

    public GitStatusCommandHandler(CommandEnum commandEnum) {
        super(commandEnum);
    }

    @Override
    protected void doEcho(CommandDTO commandDTO) {
        System.out.println("GitStatusCommandHandler收到的命令: "+commandDTO.getCommandEnum().name());
    }
}
