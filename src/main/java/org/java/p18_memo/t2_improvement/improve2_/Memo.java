package org.java.p18_memo.t2_improvement.improve2_;

/**
 * Created by lzq on 2018/4/4.
 * 备忘录
 * 由备忘录来管理这个状态
 */
public class Memo {

    //状态
    private String state;

    public Memo(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
