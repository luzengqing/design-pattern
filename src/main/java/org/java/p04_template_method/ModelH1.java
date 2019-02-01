package org.java.p04_template_method;

/**
 * Created by lzq on 2018/3/22.
 * 具体模板
 */
public class ModelH1 extends AbstractModel {

    /**
     * 子类实现基本方法
     */

    @Override
    public void doSomething() {
        System.out.println("模型H1在打架。。。");
    }

    @Override
    public void say() {
        System.out.println("你好，我是H1");

    }
}
