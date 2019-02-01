package org.java.p100_command_responsibilityChain;

import org.java.p100_command_responsibilityChain.command.AbstractCommand;
import org.java.p100_command_responsibilityChain.command.GitCommand;
import org.java.p100_command_responsibilityChain.command.LSCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/3/27.
 * 接收命令的负责人
 */
public class Invoker {

    //模拟一个上下文环境
    private static List<AbstractCommand> context;

    //初始化上下文
    static {
        context = new ArrayList<>();
        AbstractCommand gitCommand  = new GitCommand();
        AbstractCommand lsCommand  = new LSCommand();
        context.add(gitCommand);
        context.add(lsCommand);
    }

    /**
     * 解析命令参数，交由具体的命令去处理
     * @param commandDTO
     */
    void action(CommandDTO commandDTO) {
        //找出与命令参数相同类型的命令
        for (AbstractCommand command : context) {
            if (command.getCommandType().equals(commandDTO.getCommandEnum().getType())) {
                command.execute(commandDTO);
            }
        }
    }
}
