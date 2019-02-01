package org.java.p06_proxy.extend03_jdk_dynamic_proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by louis on 2018/3/24.
 */
public class Client {


    @Test
    public void t1() {
        //定义一个玩家（被代理目标）
        GamePlayer zhangsan = new GamePlayer("张三");

        //定义代理对象的执行处理器
        InvocationHandler handler = new GamePlayerInvocationHandler(zhangsan);

        //动态产生一个代理实例
        //动态代理，在实现阶段不关心代理谁，而是在运行阶段才指定代理哪个对象
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(), zhangsan.getClass().getInterfaces(), handler);

        proxy.login("zhangsan", "123");

        proxy.kill();

        proxy.update();

    }

    @Test
    public void t2() {
        //定义一个二环十三郎
        IDriver chenzhen = new Driver("陈震");

        //定义陈震的代理对象的处理器
        InvocationHandler handler =  (proxy, method, args) -> {
            System.out.println("前置通知。。。");
            Object result = method.invoke(chenzhen, args);
            System.out.println("后置通知。。。");
            return result;
        };

        //动态为陈震找一个代理对象
        IDriver proxy = (IDriver) Proxy.newProxyInstance(chenzhen.getClass().getClassLoader(), chenzhen.getClass().getInterfaces(), handler);

        //由代理对象去飙车
        proxy.drive();
    }

}
