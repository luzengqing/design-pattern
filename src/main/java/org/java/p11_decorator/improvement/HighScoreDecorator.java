package org.java.p11_decorator.improvement;

/**
 * Created by lzq on 2018/3/29.
 * 汇报最高分的装饰类
 */
public class HighScoreDecorator extends AbstractDecorator {


    public HighScoreDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }


    //首先定义要美化的方法，向老爸反应班级最高成绩
    private void sayHighestScore() {

        System.out.println("这次考试语文最高是75，数学是78，自然是80");

    }

    //我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊
    @Override
    public void report() {
        this.sayHighestScore();
        super.report();
    }
}
