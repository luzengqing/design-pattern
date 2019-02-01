package org.java.p18_memo.t4_extension.extension1_clone;


/**
 * Created by lzq on 2018/4/4.
 * 发起人自主备份和恢复
 */
public class Originator implements Cloneable {

    //备份
    private Originator backup;

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
    public Originator createMemo() {
        this.backup = this.clone();
        return backup;
    }

    //恢复一个备忘录
    public void restoreMemo() {
        this.setState(this.backup.getState());
    }

    //克隆当前对象
    //考虑一下原型模式深拷贝和浅拷贝的问题，在复杂的场景下它会
    //让你的程序逻辑异常混乱，出现错误也很难跟踪。因此Clone方式的备忘录模式适用于较简
    //单的场景。
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
