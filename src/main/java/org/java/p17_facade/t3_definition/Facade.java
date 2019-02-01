package org.java.p17_facade.t3_definition;

/**
 * Created by lzq on 2018/4/4.
 * 门面角色
 * 客户端可以调用这个角色的方法。此角色知晓子系统的所有功能和责任。一般情况下，
 本角色会将所有从客户端发来的请求委派到相应的子系统去，也就说该角色没有实际的业务
 逻辑，只是一个委托类。
 */
public class Facade {

    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    //提供给外界访问的入口

    public void doSomethingA() {
        this.classA.doSomethingA();
    }


    public void doSomethingB() {
        this.classB.doSomethingB();
    }


    public void doSomethingC() {
        this.classC.doSomethingC();
    }



}
