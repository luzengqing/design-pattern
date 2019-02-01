package org.java.p04_template_method.extend;


/**
 * Created by lzq on 2018/3/22.
 */
public abstract class AbstractModel implements Model {


    @Override
    public final void templateMethod() {

        this.say();

        this.doSomething1();

        /**
         * 子类自己控制钩子方法，来达到影响模板方法的执行流程的效果，完美！
         */
        if (this.hookFunction()) {
            this.doSomething2();
        }

        this.doSomething3();


    }
}
