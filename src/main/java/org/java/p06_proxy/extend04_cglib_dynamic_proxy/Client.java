package org.java.p06_proxy.extend04_cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.Test;

/**
 * Created by louis on 2018/3/24.
 */
public class Client {


    @Test
    public void t1() {

        //定义一个痴迷的玩家
        GamePlayer gamePlayer = new GamePlayer("刘星");

        //定义一个interceptor
        MethodInterceptor interceptor = new GamePlayerMethodInterceptor(gamePlayer);

        //由CGLib动态生成一个代理对象
        GamePlayer proxy = (GamePlayer) Enhancer.create(gamePlayer.getClass(), interceptor);

        proxy.login("liuxing", "321");

        proxy.kill();

        proxy.update();

    }
}
