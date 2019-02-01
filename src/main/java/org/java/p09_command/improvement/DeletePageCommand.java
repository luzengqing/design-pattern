package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 * 删除页面需求
 */
public class DeletePageCommand extends AbstractCommand {

    //收到删除页面命令，立即找到美工组，要求删除页面，执行计划的变更
    @Override
    public void execute() {

        this.pageGroup.find();

        this.pageGroup.delete();

        this.pageGroup.change();
    }
}
