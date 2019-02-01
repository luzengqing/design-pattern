package org.java.p100_command_responsibilityChain.responsibility_chain;

import org.java.p100_command_responsibilityChain.CommandDTO;

/**
 * Created by lzq on 2018/3/27.
 */
public interface CommandHandler {

    /**
     * 处理请求
     * @param commandDTO
     */
    void handleMessage(CommandDTO commandDTO);

    /**
     * 设置下一个责任人
     * @param commandHandler
     */
    void setNext(CommandHandler commandHandler);
}
