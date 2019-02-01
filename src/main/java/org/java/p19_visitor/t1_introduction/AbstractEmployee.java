package org.java.p19_visitor.t1_introduction;

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


    //模板方法 汇报员工信息
    public void report() {
        String info = "姓名：" + this.name + "\t";
        info = info + "性别：" + (this.sex == FEMALE?"女":"男") + "\t";
        info = info + "薪水：" + this.salary + "\t";
        //获得员工的其他信息
        info = info + this.getOtherInfo();
        System.out.println(info);
    }

    //基本方法，获取员工的其他信息
    protected abstract String getOtherInfo();





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
