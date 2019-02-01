package org.java.p19_visitor.t4_extension.extension2_multiVisitor;

/**
 * Created by lzq on 2018/4/6.
 * 抽象员工类
 */
public abstract class AbstractEmployee {

    //男性
    public static final int MALE = 0;
    //女性
    public static final int FEMALE = 1;

    //是员工就有姓名
    private String name;

    //是员工就有薪水
    private int salary;

    //性别很重要
    private int sex;


    //定义能接收的访问者
    protected abstract void accept(IVisitor visitor);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
