package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 * 美工组
 */
public class PageGroup extends AbstractGroup {

    //首先这个美工组应该能找到吧，要不你跟谁谈？
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    //美工被要求增加一个页面
    @Override
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    //客户要求对现有界面做修改
    @Override
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    //甲方是老大，要求删除一些页面
    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    //所有的增、删、改都要给出计划
    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }


}
