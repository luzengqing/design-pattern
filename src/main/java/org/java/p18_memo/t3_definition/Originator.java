package org.java.p18_memo.t3_definition;

/**
 * Created by lzq on 2018/4/4.
 * 发起人角色
 */
public class Originator {

    //内部状态
    private String state;


    //获取状态
    public String getState() {
        return state;
    }

    //改变状态
    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public Memo createMemo(){
        return new Memo(this.state);
    }
    //恢复一个备忘录
    public void restoreMemo(Memo memo){
        this.setState(memo.getState());
    }
}
