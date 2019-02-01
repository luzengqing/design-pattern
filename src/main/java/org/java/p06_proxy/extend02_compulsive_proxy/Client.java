package org.java.p06_proxy.extend02_compulsive_proxy;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/23.
 * 强制代理模式
 */
public class Client {

    /**
     * 在强制代理模式中，你必须通过真实角色查找到代理角色，否则你不能访
     问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，只有通过真实角
     色指定的代理类才可以访问，也就是说由真实角色管理代理角色。这么说吧，高层模块new
     了一个真实角色的对象，返回的却是代理角色.
     */




    //直接访问真实角色
    @Test
    public void t1() {
        //定义一个真实的游戏角色
        IGamePlayer zhangsan = new GamePlayer("张三");

        //记下时间
        System.out.println("开始时间: 2018-03-23 12:00:00");

        //开始登录杀怪升级
        zhangsan.login("张三", "123");
        zhangsan.kill();
        zhangsan.levelUpdate();

        System.out.println("结束时间: 2018-03-24 01:30:00");

        //最终结果是无权限操作，请使用代理访问。。。

    }


    //直接访问代理角色
    @Test
    public void t2() {
        //定义一个真实的游戏角色
        IGamePlayer zhangsan = new GamePlayer("张三");

        //自己随便找了一个代理
        IGamePlayer proxy = new GamerPlayerProxy(zhangsan);

        //记下时间
        System.out.println("开始时间: 2018-03-23 12:00:00");

        //开始登录杀怪升级
        proxy.login("张三", "123");
        proxy.kill();
        proxy.levelUpdate();

        System.out.println("结束时间: 2018-03-24 01:30:00");

        //最终结果依旧是无权限操作，请使用代理访问。。。

        /**
         * 还是不能访问，为什么呢？它不是真实角色自己指定的代理对象，这个代理对象是你自己new出
         来的，当然真实角色不认了，这就好比是找某个明星，人家已经告诉你去找她的代理人了，你
         随便找个代理人能成吗？你必须去找她指定的代理才成
         */

    }

    //通过真实角色访问他指定的代理角色
    @Test
    public void t3() {
        //定义一个真实的游戏角色
        IGamePlayer zhangsan = new GamePlayer("张三");

        //通过真实角色找到指定的代理
        IGamePlayer proxy = zhangsan.getProxy();

        //记下时间
        System.out.println("开始时间: 2018-03-23 12:00:00");

        //开始登录杀怪升级
        proxy.login("张三", "123");
        proxy.kill();
        proxy.levelUpdate();

        System.out.println("结束时间: 2018-03-24 01:30:00");

        //现在结果是，代理可以正常访问，打怪升级了！

        /**
         * 强制代理的概念就是要从真实角色查找到代理角色，不允
         许直接访问真实角色。高层模块只要调用getProxy就可以访问真实角色的所有方法，它根本
         就不需要产生一个代理出来，代理的管理已经由真实角色自己完成。
         */



    }

}
