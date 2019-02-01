package org.java.p11_decorator.improvement;

/**
 * Created by lzq on 2018/3/29.
 * 抽象装饰类
 * 装饰类的作用也就是一个特殊的代理类，真实的执行者还是被代理的角色
 */
public abstract class AbstractDecorator extends AbstractSchoolReport {

    //得告诉我对谁进行装饰美化，
    protected AbstractSchoolReport schoolReport;

    public AbstractDecorator(AbstractSchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    //装饰类的目的还是很简单，对被代理的角色进行封装，重写他里面的方法
    //成绩单还是要看的
    @Override
    public void report() {
        this.schoolReport.report();
    }

    //字还是要签的
    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
