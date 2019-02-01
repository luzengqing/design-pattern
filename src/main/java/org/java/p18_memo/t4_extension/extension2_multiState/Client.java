package org.java.p18_memo.t4_extension.extension2_multiState;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {

    @Test
    public void t() {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        MemoManager memoManager = new MemoManager();
        //初始化
        originator.setState1("中国");
        originator.setState2("强盛");
        originator.setState3("繁荣");
        System.out.println("===初始化状态===\n"+originator);
        //创建一个备忘录
        memoManager.setMemo(originator.createMemo());
        //修改状态值
        originator.setState1("软件");
        originator.setState2("架构");
        originator.setState3("优秀");
        System.out.println("\n===修改后状态===\n"+originator);
        //恢复一个备忘录
        originator.restoreMemo(memoManager.getMemo());
        System.out.println("\n===恢复后状态===\n"+originator);
    }
}
