package org.java.p11_decorator.introduction;

/**
 * Created by lzq on 2018/3/29.
 * 四年级成绩单
 */
public class FourthGradeSchoolReport extends AbstractSchoolReport {


    //我的成绩单描述
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }


    //家长签名
    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
