package org.java.p19_visitor.t2_improvement;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzq on 2018/4/6.
 */
public class Client {



    @Test
    public void t1() {

        for (AbstractEmployee employee : Client.mockEmployee()) {
            employee.accept(new Visitor());
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
