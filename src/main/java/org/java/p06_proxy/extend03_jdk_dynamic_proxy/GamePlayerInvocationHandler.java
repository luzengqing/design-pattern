package org.java.p06_proxy.extend03_jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by louis on 2018/3/24.
 * 代理实例的执行处理器
 */
public class GamePlayerInvocationHandler implements InvocationHandler {

    //告诉执行处理器要代理谁
    private Object target;

    public GamePlayerInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 每个代理实例都有一个执行处理器，代理实例调用一个方法时，执行流程都会被分发至此，即执行处理器的invoke方法
     * 通过Handler接口，所有被代理对象的方法都由handler来接管处理
     * @param proxy 代理实例
     * @param method 代理实例实现的接口方法
     * @param args 方法参数
     * @return 返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy: "+proxy.getClass().getName());
        System.out.println("method: "+method.getName());
        System.out.println("args: "+ Arrays.toString(args));

        //执行被代理对象自己的方法
        Object result = method.invoke(this.target, args);
        return result;
    }
}
