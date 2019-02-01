package org.java.p04_template_method.extend;

/**
 * Created by lzq on 2018/3/22.
 */
public class ModelX extends AbstractModel {


    @Override
    public void say() {
        System.out.println("大家好，我是特斯拉Model X");
    }

    @Override
    public void doSomething1() {
        System.out.println("特斯拉Model X在充电");

    }

    @Override
    public void doSomething2() {
        System.out.println("特斯拉Model X在加油");

    }

    @Override
    public void doSomething3() {
        System.out.println("特斯拉Model X在飙车");

    }

    //特斯拉 X默认不需要加油
    @Override
    public boolean hookFunction() {
        return false;
    }
}
