package org.java.p18_memo.t3_definition;


/**
 * Created by lzq on 2018/4/4.
 * 备忘录管理员
 */
public class MemoManager {

    //管理的备忘录
    private Memo memo;

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }
}
