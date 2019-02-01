package org.java.p06_proxy;

import org.junit.Test;

/**
 * Created by lzq on 2018/3/23.
 */
public class Client {


    @Test
    public void t1() {
        //定义一个痴迷的玩家
        IGamePlayer zhangsan = new GamePlayer("张三");

        //定义一个牛逼的代练工作室
        IGamePlayer proxy = new GamePlayerProxy(zhangsan);

        //记下时间
        System.out.println("开始时间: 2018-03-23 12:00:00");

        //代练者帮张三开始代练游戏
        proxy.login("zhangsan", "123");

        proxy.kill();

        proxy.levelUpdate();

        System.out.println("结束时间: 2018-03-24 01:30:00");
    }
}
