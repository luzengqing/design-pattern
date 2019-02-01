package org.java.p11_decorator.improvement;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/29.
 */
public class Client {


    @Test
    public void t1() {

        //原始成绩单
        AbstractSchoolReport schoolReport = new FourthGradeSchoolReport();

        //对成绩单美化，加了最高成绩说明
        HighScoreDecorator highScoreDecorator = new HighScoreDecorator(schoolReport);

        highScoreDecorator.report();

        highScoreDecorator.sign("张老三");
    }

    @Test
    public void t2() {

        //原始成绩单
        AbstractSchoolReport schoolReport = new FourthGradeSchoolReport();

        //对成绩单美化，加了排名情况
        RankDecorator rankDecorator = new RankDecorator(schoolReport);

        rankDecorator.report();

        rankDecorator.sign("张老三");
    }
}
