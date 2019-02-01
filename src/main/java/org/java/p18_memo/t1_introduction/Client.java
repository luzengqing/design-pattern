package org.java.p18_memo.t1_introduction;

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

        //初始化当前状态
        boy.setState("心情很棒！");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());

        //需要记录下当前状态呀
        Boy backup = new Boy();
        backup.setState(boy.getState());

        //男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());

        //追女孩失败，恢复原状
        boy.setState(backup.getState());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());


        /**
         * 问题，高层模块不应该对状态的记录及恢复负责，
         * 这应该是Boy类的职责，而不应该让高层模块来完成，也就是破坏了Boy类的封
         装，或者说Boy类没有封装好，它应该是把backup的定义容纳进来，而不应该让高层模块来
         定义。
         */
    }
}
