package org.java.p100_command_responsibilityChain.command;

import org.java.p100_command_responsibilityChain.CommandDTO;
import org.java.p100_command_responsibilityChain.CommandEnum;
import org.java.p100_command_responsibilityChain.responsibility_chain.CommandHandler;
import org.java.p100_command_responsibilityChain.responsibility_chain.LSCommandHandler;
import org.java.p100_command_responsibilityChain.responsibility_chain.LS_ACommandHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/3/27.
 * LS命令抽象类
 */
public class LSCommand extends AbstractCommand {

    public LSCommand() {
        super(CommandEnum.LS.getType());
    }

    //返回一条LS命令族的责任链
    @Override
    public List<CommandHandler> buildChain(CommandDTO commandDTO) {
        List<CommandHandler> list = new ArrayList<>();

        //指定处理该命令的节点
        CommandHandler lsCommandHandler = new LSCommandHandler(CommandEnum.LS);
        CommandHandler ls_aCommandHandler = new LS_ACommandHandler(CommandEnum.LS_A);

        //设置责任链顺序
        lsCommandHandler.setNext(ls_aCommandHandler);

        //把各个节点添加至责任链中
        list.add(lsCommandHandler);
        list.add(ls_aCommandHandler);
        return list;
    }
}
