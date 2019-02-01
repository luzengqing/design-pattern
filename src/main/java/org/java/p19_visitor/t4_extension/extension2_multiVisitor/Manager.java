package org.java.p19_visitor.t4_extension.extension2_multiVisitor;


/**
 * Created by lzq on 2018/4/6.
 * 管理员
 */
public class Manager extends AbstractEmployee {

    //这类人物的职责非常明确：业绩
    private String performance;



    //允许访问者访问经理
    @Override
    public void accept(IVisitor visitor) {
        //把自身传递过去， 允许访问者访问本身这个对象
        visitor.visit(this);
    }


    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

}
