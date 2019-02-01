package org.java.p19_visitor.t4_extension.extension1_statistics;

/**
 * Created by lzq on 2018/4/6.
 * 访问者
 * 这个访问既负责展示数据，如个人信息情况
 * 又负责统计数据，如统计总薪水
 */
public class Visitor implements IVisitor {

    //普通员工的工资系数
    private static final int COMMON_COEFFICIENT = 2;

    //经理的工资系数
    private static final int MANAGER_COEFFICIENT = 5;

    //普通员工总薪水
    private int commonTotalSalary;

    //部门经理总薪水
    private int managerTotalSalary;


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

    //统计所有员工的总薪水
    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
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
