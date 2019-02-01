package org.java.p18_memo.t4_extension.extension3_multiBackup;


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
        MemoManager caretaker = new MemoManager();
        //创建两个时间戳的备忘录
        caretaker.setMemo("001",originator.createMemo());
        caretaker.setMemo("002",originator.createMemo());
        //恢复一个指定时间戳的备忘录
        originator.restoreMemo(caretaker.getMemo("001"));
    }
}
