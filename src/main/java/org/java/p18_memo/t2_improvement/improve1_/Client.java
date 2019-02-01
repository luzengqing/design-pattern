package org.java.p18_memo.t2_improvement.improve1_;

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

        //根据当前状态创建备忘录
        Memo memo = boy.createMemo();

        //男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());

        //追女孩失败，根据备忘录恢复原状
        boy.restoreMemo(memo);
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());


        /**
         * 问题，虽然程序中不再重复定义Boy类的对象了，但是高层模块还是要关心备忘录
         * 对高层模块来说，它最希望要做的就是创建一个备份点，然后在需
         要的时候再恢复到这个备份点就成了，它不用关心到底有没有备忘录这个类。
         *
         */
    }
}
