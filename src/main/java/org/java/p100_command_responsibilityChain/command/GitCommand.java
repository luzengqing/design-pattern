package org.java.p100_command_responsibilityChain.command;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.CommandEnum;
import org.java.p100_command_responsibilityChain.responsibility_chain.CommandHandler;
import org.java.p100_command_responsibilityChain.responsibility_chain.GitCheckoutCommandHandler;
import org.java.p100_command_responsibilityChain.responsibility_chain.GitStatusCommandHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/3/27.
 * Git命令抽象类
 */
public class GitCommand extends AbstractCommand {

    public GitCommand() {
        super(CommandEnum.GIT_CHECKOUT.getType());
    }

    //基本方法
    //返回一条Git命令族的责任链
    @Override
    public List<CommandHandler> buildChain(CommandDTO commandDTO) {
        List<CommandHandler> list = new ArrayList<>();

        //指定处理该命令的节点
        CommandHandler gitCheckoutCommandHandler = new GitCheckoutCommandHandler(CommandEnum.GIT_CHECKOUT);
        CommandHandler gitStatusCommandHandler = new GitStatusCommandHandler(CommandEnum.GIT_STATUS);

        //设置责任链顺序
        gitCheckoutCommandHandler.setNext(gitStatusCommandHandler);

        //把各个节点添加至责任链中
        list.add(gitCheckoutCommandHandler);
        list.add(gitStatusCommandHandler);
        return list;
    }
}
