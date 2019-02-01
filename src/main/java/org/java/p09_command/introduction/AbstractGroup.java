package org.java.p09_command.introduction;

/**
 * Created by lzq on 2018/3/27.
 * 抽象组
 */
public abstract class AbstractGroup {

    /**
     * 抽象类中的每个方法，其中的每个都是一个命令语气——“找到它，增加，删除，给我计划！”
     * 这些都是命令，给出命令然后由相关的人员去执行
     */


    //甲乙双方分开办公，如果你要和某个组讨论，你首先要找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //被要求给出所有的变更计划
    public abstract void plan();
}
