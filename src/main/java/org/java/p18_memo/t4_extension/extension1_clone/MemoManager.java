package org.java.p18_memo.t4_extension.extension1_clone;

/**
 * Created by lzq on 2018/4/4.
 * 备忘录管理员
 */
public class MemoManager {

    //发起人
    private Originator originator;

    public MemoManager(Originator originator) {
        this.originator = originator;
    }

    public Originator getOriginator() {
        return originator;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
