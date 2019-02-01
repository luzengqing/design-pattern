package org.java.p11_decorator.improvement;

/**
 * Created by lzq on 2018/3/29.
 * 学校成绩单
 */
public abstract class AbstractSchoolReport {

    //描述成绩单
    public abstract void report();

    //家长签字
    public abstract void sign(String name);
}
