package org.java.p09_command.definition;

/**
 * Created by lzq on 2018/3/27.
 * 命令接口（封装请求）
 */
public interface Command {

    //执行命令，具体由子类负责
    void execute();
}
