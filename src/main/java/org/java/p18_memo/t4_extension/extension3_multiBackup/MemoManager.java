package org.java.p18_memo.t4_extension.extension3_multiBackup;



import java.util.Map;

/**
 * Created by lzq on 2018/4/4.
 * 备忘录管理员
 */
public class MemoManager {

    //备忘录容器
    //key 时间戳  value 备忘录对象
    private Map<String, Memo> memoMap;

    /**
     * 内存溢出问题，该备份一旦产生就装入内存，没有任何销毁的意向，这是非常危
     险的。因此，在系统设计时，要严格限定备忘录的创建，建议增加Map的上限，否则系统很
     容易产生内存溢出情况。
     * @param timestamp
     * @return
     */



    //获取某个时间戳时的备忘录
    public Memo getMemo(String timestamp) {
        return memoMap.get(timestamp);
    }

    //设置某个时间戳下的备忘录
    public void setMemo(String timestamp, Memo memo) {
        this.memoMap.put(timestamp, memo);
    }

    public Map<String, Memo> getMemoMap() {
        return memoMap;
    }

    public void setMemoMap(Map<String, Memo> memoMap) {
        this.memoMap = memoMap;
    }
}
