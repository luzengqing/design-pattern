package org.java.p11_decorator.improvement;

/**
 * Created by lzq on 2018/3/29.
 * 排名装饰类
 */
public class RankDecorator extends AbstractDecorator {


    public RankDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    //美化的方法，告诉老爸学校的排名情况
    private void sayRank() {
        System.out.println("我是排名第38名...");
    }


    //老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.sayRank();
    }
}
