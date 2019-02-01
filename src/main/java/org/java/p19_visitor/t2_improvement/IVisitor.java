package org.java.p19_visitor.t2_improvement;

/**
 * Created by lzq on 2018/4/6.
 * 访问者接口
 */
public interface IVisitor {

    //首先，我可以访问普通员工
    void visit(CommonEmployee commonEmployee);

    //其次，我也能访问经理
    void visit(Manager manager);

}
