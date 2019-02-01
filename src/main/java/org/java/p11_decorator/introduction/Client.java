package org.java.p11_decorator.introduction;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/29.
 */
public class Client {


    @Test
    public void t1() {

        //拿到原始成绩单
        FourthGradeSchoolReport report = new FourthGradeSchoolReport();

        //这烂成绩
        report.report();

        //这么差，还要家长签字？？
        report.sign(null);

    }

    @Test
    public void t2() {

        //拿美化后的成绩单
        SugarFourthGradeSchoolReport sugarReport = new SugarFourthGradeSchoolReport();

        //看成绩单
        sugarReport.report();

        //老爸看了很开心，就立马签字了
        sugarReport.sign("老三");


        /**
         * 通过继承确实能够解决这个问题，但现实情况比较复杂，有可能父亲听到最高成绩，乐开了花就签字了，
         * 又或者先听排名情况，在看成绩，等等，这样继承的子类就会特别多。。。
         * 解决思路： 通过定义抽象的装饰类，根据情况，针对不同的情况声明不同的装饰类
         */

    }
}
