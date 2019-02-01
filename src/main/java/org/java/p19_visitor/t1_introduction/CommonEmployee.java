package org.java.p19_visitor.t1_introduction;

/**
 * Created by lzq on 2018/4/6.
 * 普通员工
 */
public class CommonEmployee extends AbstractEmployee {

    //工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;


    @Override
    protected String getOtherInfo() {
        return "工作："+ this.job + "\t";
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
