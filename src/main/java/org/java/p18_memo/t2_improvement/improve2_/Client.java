package org.java.p18_memo.t2_improvement.improve2_;

import org.junit.Test;

/**
 * Created by lzq on 2018/4/4.
 */
public class Client {

    @Test
    public void t() {

        //模拟男孩追女孩的过程，没追到失败了，恢复最初的状态

        //声明出主角
        Boy boy = new Boy();

        //备忘录管理员
        MemoManager memoManager = new MemoManager();

        //初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());

        //把男孩当前的状态丢给管理员管理
        memoManager.setMemo(boy.createMemo());

        //男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());

        //追女孩失败，去管理员那取出备忘录恢复状态
        boy.restoreMemo(memoManager.getMemo());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());

    }
}
