package org.java.p18_memo.t4_extension.extension3_multiBackup;

import java.util.Map;

/**
 * Created by lzq on 2018/4/4.
 * 备忘录
 * 由备忘录来管理这个状态
 */
public class Memo {

    //发起人的内部多个状态
    private Map<String, Object> stateMap;

    public Memo(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
