package org.java.p09_command.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public class CodeGroup extends AbstractGroup {

    //客户要求代码组过去和他们谈
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    //客户要求增加一项功能
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    @Override
    //客户要求修改一项功能
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    //客户要求删除一项功能
    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    //客户要求给出变更计划
    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
