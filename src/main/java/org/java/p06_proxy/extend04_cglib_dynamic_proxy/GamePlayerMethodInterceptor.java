package org.java.p06_proxy.extend04_cglib_dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by louis on 2018/3/24.
 * 代理对象的方法拦截器
 */
public class GamePlayerMethodInterceptor implements MethodInterceptor {

    private Object target;

    public GamePlayerMethodInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 与JDK动态代理的InvocationHandler一样，Cglib产生的代理对象都有一个MethodInterceptor，
     * 所有被代理的对象的方法，都交由此处管理
     * @param obj 被代理对象
     * @param method 目标方法
     * @param args 方法参数
     * @param proxy 方法代理（cglib是方法级别的代理）
     * @return 返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        Object result = method.invoke(this.target, args);

        return result;
    }
}
