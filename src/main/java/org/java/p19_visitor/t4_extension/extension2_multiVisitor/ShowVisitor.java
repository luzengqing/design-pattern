package org.java.p19_visitor.t4_extension.extension2_multiVisitor;


/**
 * Created by lzq on 2018/4/6.
 * 展示报表的访问者
 */
public class ShowVisitor implements IShowVisitor {

    private String info;

    //打印报表
    @Override
    public void report() {
        System.out.println(this.info);
    }

    //访问普通员工，组装信息
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.getCommonEmployee(commonEmployee);
    }

    //访问部门经理，组装信息
    @Override
    public void visit(Manager manager) {
        this.info = this.getManagerInfo(manager);

    }

    //组装出基本信息
    private String getBasicInfo(AbstractEmployee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == AbstractEmployee.FEMALE?"女":"男" )+ "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩："+manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }
    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作："+commonEmployee.getJob()+"\t";
        return basicInfo + otherInfo;
    }
}
