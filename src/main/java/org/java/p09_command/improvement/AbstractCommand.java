package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 * 命令抽象类
 */
public abstract class AbstractCommand {

    //由命令去与三个具体小组去联系，不同的命令找不同的小组
    protected AbstractGroup requirementGroup = new RequirementGroup();
    protected AbstractGroup pageGroup = new PageGroup();
    protected AbstractGroup codeGroup = new CodeGroup();

    /**
     * 执行命令
     */
    public abstract void execute();



}
