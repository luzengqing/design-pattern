package org.java.p18_memo.t3_definition;

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
        //创建一个备忘录
        caretaker.setMemo(originator.createMemo());
        //恢复一个备忘录
        originator.restoreMemo(caretaker.getMemo());
    }
}
