package org.java.p10_responsibility_chain.improvement;

/**
 * Created by lzq on 2018/3/27.
 */
public class Women implements IWomen {

    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁 向父亲请示
     * 2--出嫁  向丈夫请示
     * 3--夫死 向儿子请示
     */
    private int level;

    //自己的请示要求，逛街，吃饭，看电影。。。
    private String request;


    public Women(int level, String request) {
        this.level = level;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.level;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
