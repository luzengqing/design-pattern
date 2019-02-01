package org.java.p04_template_method.extend;

/**
 * Created by lzq on 2018/3/22.
 */
public class ModelS extends AbstractModel {

    private boolean flag = true;

    @Override
    public void say() {
        System.out.println("大家好，我是特斯拉Model S");
    }

    @Override
    public void doSomething1() {
        System.out.println("特斯拉Model S在充电");

    }

    @Override
    public void doSomething2() {
        System.out.println("特斯拉Model S在加油");

    }

    @Override
    public void doSomething3() {
        System.out.println("特斯拉Model S在飙车");

    }

    @Override
    public boolean hookFunction() {
        return flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
