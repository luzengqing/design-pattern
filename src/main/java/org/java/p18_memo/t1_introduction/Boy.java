package org.java.p18_memo.t1_introduction;

/**
 * Created by lzq on 2018/4/4.
 * 男孩
 */
public class Boy {

    //内部状态
    private String state;


    public void changeState() {
        this.state = "心情可能不好";
    }

    //获取状态
    public String getState() {
        return state;
    }

    //改变状态
    public void setState(String state) {
        this.state = state;
    }
}
