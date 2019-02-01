package org.java.p19_visitor.t4_extension.extension2_multiVisitor;

/**
 * Created by lzq on 2018/4/6.
 * 统计报表的访问者
 */
public class CountVisitor implements ICountVisitor {

    //普通员工的工资系数
    private static final int COMMON_COEFFICIENT = 2;

    //经理的工资系数
    private static final int MANAGER_COEFFICIENT = 5;

    //普通员工总薪水
    private int commonTotalSalary;

    //部门经理总薪水
    private int managerTotalSalary;

    //统计报表
    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    //访问普通员工，统计薪水
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.calCommonSalary(commonEmployee.getSalary());
    }

    //访问部门经理，统计薪水
    @Override
    public void visit(Manager manager) {
        this.calManagerSalary(manager.getSalary());
    }

    //计算部门经理的工资总和
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary + salary
                *MANAGER_COEFFICIENT ;
    }

    //计算普通员工的工资总和
    private void calCommonSalary(int salary){
        this.commonTotalSalary = this.commonTotalSalary +
                salary*COMMON_COEFFICIENT;
    }
}
