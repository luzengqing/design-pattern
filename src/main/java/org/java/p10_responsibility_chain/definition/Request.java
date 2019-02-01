package org.java.p10_responsibility_chain.definition;

/**
 * Created by lzq on 2018/3/27.
 * 负责封装请求参数
 */
public class Request {

    //该请求的级别
    private Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
