package org.java.p18_memo.t4_extension.extension2_multiState;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzq on 2018/4/4.
 * 发起人角色
 */
public class Originator {

    //内部状态
    private String state1;

    private String state2;

    private String state3;


    //创建一个备忘录
    public Memo createMemo(){
        return new Memo(this.createMap());
    }


    //恢复一个备忘录
    public void restoreMemo(Memo memo){
        Map<String, Object> stateMap = memo.getStateMap();
        this.setState1(stateMap.get("state1").toString());
        this.setState2(stateMap.get("state2").toString());
        this.setState3(stateMap.get("state3").toString());
    }

    //把多个状态放入一个map
    private Map<String, Object> createMap() {
        Map<String, Object> stateMap = new HashMap<>();
        stateMap.put("state1", this.state1);
        stateMap.put("state2", this.state2);
        stateMap.put("state3", this.state3);
        return stateMap;
    }


    //获取状态
    public String getState1() {
        return state1;
    }

    //改变状态
    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    //增加一个toString方法
    public String toString(){
        return "state1=" +state1+"\nstat2="+state2+"\nstate3="+state3;
    }

}
