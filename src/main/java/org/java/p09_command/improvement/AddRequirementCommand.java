package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 * 增加需求命令
 */
public class AddRequirementCommand extends AbstractCommand {

    //收到添加需求命令，立即找到需求组，要求添加需求，执行计划的变更
    @Override
    public void execute() {

        //找到需求组
        this.requirementGroup.find();

        //添加需求
        this.requirementGroup.add();

        //执行计划变更
        this.requirementGroup.change();

    }
}
