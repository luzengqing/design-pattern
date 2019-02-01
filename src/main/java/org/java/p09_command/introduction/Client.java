package org.java.p09_command.introduction;

import org.java.p09_command.improvement.AbstractGroup;
import org.java.p09_command.improvement.PageGroup;
import org.java.p09_command.improvement.RequirementGroup;
import org.junit.Test;

/**
 * Created by lzq on 2018/3/27.
 */
public class Client {

    @Test
    public void t1() {
        /**
         * 客户刚开始提交了他们自己写的一份比较完整的需求，
         * 需求组根据这份需求写了一份分析说明书，客户看后，要求增加需求
         */

        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("-----------客户要求增加一项需求---------------");
        AbstractGroup rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();
    }

    @Test
    public void t2() {
        /**
         * 客户的需求暂时满足了，过了一段时间，客户又要求“界面多画了一个，过来谈谈”，于
         是又有一次场景变化
         */

        //首先客户找到美工组说，过来谈需求，并修改
        System.out.println("-----------客户要求删除一个页面---------------");
        AbstractGroup pg = new PageGroup();
        //找到美工组
        pg.find();
        //删除一个页面
        pg.delete();
        //要求变更计划
        pg.plan();
    }


    /**
     * 上面已经看出来了：一个需求的变化，客户都要直接去找相应的负责的小组，长期以往客户很烦躁，还容易出错，
     * 客户就说：“我不管你们内部怎么安排，你就给我找个接头负责人，我告诉他怎么做，删除页面，增加功能，你们内
     部怎么处理我不管，我就告诉他我要干什么就成了……”

     于是，命令模式就出现了。客户（Client）下达一个命令（Command），项目经理（Invoker）接收到命令，根据命令的类型不同（各个实现类）
     ，去给相关的人员（Receiver）去处理。
     这种设计模式，将各个需求通过命令封装起来，提现出高内聚，可扩展特点。
     */


}
