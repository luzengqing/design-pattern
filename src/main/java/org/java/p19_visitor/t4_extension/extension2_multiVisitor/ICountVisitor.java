package org.java.p19_visitor.t4_extension.extension2_multiVisitor;

/**
 * Created by lzq on 2018/4/6.
 * 汇总表接口
 */
public interface ICountVisitor extends IVisitor {

    //汇总薪水
    int getTotalSalary();
}
