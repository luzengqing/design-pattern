package org.java.p19_visitor.t1_introduction;

/**
 * Created by lzq on 2018/4/6.
 * 管理员
 */
public class Manager extends AbstractEmployee {

    //这类人物的职责非常明确：业绩
    private String performance;


    @Override
    protected String getOtherInfo() {
        return "业绩："+ this.performance + "\t";
    }


    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
