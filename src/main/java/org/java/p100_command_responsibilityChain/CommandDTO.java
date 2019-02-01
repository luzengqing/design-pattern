package org.java.p100_command_responsibilityChain;

/**
 * Created by lzq on 2018/3/27.
 * 命令数据对象
 */
public class CommandDTO {

    //命令的类型
    private CommandEnum commandEnum;


    public CommandDTO(CommandEnum commandEnum) {
        this.commandEnum = commandEnum;
    }

    public CommandEnum getCommandEnum() {
        return commandEnum;
    }

    public void setCommandEnum(CommandEnum commandEnum) {
        this.commandEnum = commandEnum;
    }
}
