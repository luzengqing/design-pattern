package org.java.p19_visitor.t2_improvement;


/**
 * Created by lzq on 2018/4/6.
 * 普通员工
 */
public class CommonEmployee extends AbstractEmployee {

    //工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;



    //允许访问者访问普通员工
    @Override
    public void accept(IVisitor visitor) {
        //把自身传递过去， 允许访问者访问本身这个对象
        visitor.visit(this);
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
