package org.java.p11_decorator.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 对四年级成绩单进行装饰，美化（伪装）
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {


    //首先定义要美化的方法，先向老爸反应班级最高成绩
    private void sayHighestScore() {

        System.out.println("这次考试语文最高是75，数学是78，自然是80");

    }

    //说完成绩，再描述下排名情况
    private void sayRank() {
        System.out.println("我是排名第38名...");
    }

    //美化的类，重写原来的汇报成绩单方法
    @Override
    public void report() {
        //先说最高成绩
        this.sayHighestScore();
        //然后描述成绩单
        super.report();
        //最后汇报排名情况
        this.sayRank();
    }
}
