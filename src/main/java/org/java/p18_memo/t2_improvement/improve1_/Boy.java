package org.java.p18_memo.t2_improvement.improve1_;

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

    //创建备忘录
    public Memo createMemo() {
        return new Memo(this.state);
    }

    //根据一个备忘录恢复状态
    public void restoreMemo(Memo memo) {
        this.state = memo.getState();
    }
}
