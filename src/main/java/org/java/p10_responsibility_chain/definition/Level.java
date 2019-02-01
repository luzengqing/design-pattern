package org.java.p10_responsibility_chain.definition;

/**
 * Created by lzq on 2018/3/27.
 * 定义请求和处理级别
 */
public class Level {

    private Integer level;

    public Level(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
