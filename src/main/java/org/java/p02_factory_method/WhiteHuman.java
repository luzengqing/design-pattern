package org.java.p02_factory_method;

/**
 * Created by lzq on 2018/3/21.
 */
public class WhiteHuman implements Human {

    @Override
    public void say() {
        System.out.println("我是白种人["+this.getClass()+"]["+this.hashCode()+"]");
    }
}
