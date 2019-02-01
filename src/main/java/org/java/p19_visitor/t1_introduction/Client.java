package org.java.p19_visitor.t1_introduction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {

    /**
     * 综合成一句话，这个报表会修改：数据的修改以及报表的展现修改，按照开闭原则，项
     * 目分析的时候已经考虑到这些可能引起变更的因素，就需要在设计时考虑通过扩展来避开未
     * 来需求变更而引起的代码修改风险。我们来想一想，每个普通员工类和经理类都用一个方法
     * report（从父类继承过来的），他无法为每一个子类定制特殊的属性
     */

    /**
     * 结果出来了，非常正确。我们来想一想实际的情况，人力资源部门拿这份表格会给谁看
     * 呢？那当然是大老板了！大老板关心的是什么？关心部门经理的业绩！小兵的情况不是他要
     * 了解的
     * 因此针对给每个大老板的报表应该是不一样的
     */

    /**
     * 我们思考一下，如何提供一个能够为每个子类定制报表的方法呢？可以这样思考，普通
     * 员工和管理层员工是两个不同的对象，例如，我邀请一个人过来参观我的家，参观者参观完
     * 毕后分别进行描述，那参观的对象不同，描述的结果也当然不同。好，按照这思路，我们把
     * 方法report提取到另外一个类Visitor中来实现
     */


    @Test
    public void t1() {

        for (AbstractEmployee employee : Client.mockEmployee()) {
            employee.report();
        }
    }

    //模拟出公司的人员情况，我们可以想象这个数据是通过持久层传递过来的
    public static List<AbstractEmployee> mockEmployee(){
        List<AbstractEmployee> empList = new ArrayList<AbstractEmployee>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(AbstractEmployee.MALE);
        empList.add(zhangSan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(AbstractEmployee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(AbstractEmployee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
