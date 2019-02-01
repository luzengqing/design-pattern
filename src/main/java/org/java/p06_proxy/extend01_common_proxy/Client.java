package org.java.p06_proxy.extend01_common_proxy;


import org.junit.Test;

/**
 * Created by lzq on 2018/3/23.
 */
public class Client {

    /**
     * 普通代理模式
     * 调用者只知代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响，
     * 真实的主题角色想怎么修改就怎么修改，对高层次的模块没有任何的影响，
     * 只要你实现了接口所对应的方法，该模式非常适合对扩展性要求较高的场合。
     */


    @Test
    public void t1() {

        //定义一个普通代理者，只传入被代理名称，客户端不直接操作被代理觉得
        IGamePlayer proxy = new GamePlayerProxy("张三");

        //记下时间
        System.out.println("开始时间: 2018-03-23 12:00:00");

        //代练者帮张三开始代练游戏
        proxy.login("zhangsan", "123");

        proxy.kill();

        proxy.levelUpdate();

        System.out.println("结束时间: 2018-03-24 01:30:00");
    }
}
