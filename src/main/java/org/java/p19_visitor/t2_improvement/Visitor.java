package org.java.p19_visitor.t2_improvement;

/**
 * Created by lzq on 2018/4/6.
 * 访问者
 */
public class Visitor implements IVisitor {


    //访问者访问某个元素对象，具体要干什么事，就定义在这里面，是打印报表？是统计工资？还是。。。
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    /**
     * 把以前在抽象类，和自己内部生成数据格式的操作，挪到了一个访问者visitor里，
     * 让访问者来操作，从而规避未来业务需求变化导致代码变更的风险。
     * 如果再来一种报表格式，那么只要只写一个访问者实现类就完成了扩展
     */





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
