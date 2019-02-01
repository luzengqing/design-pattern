package org.java.p17_facade.t4_extension;

/**
 * Created by lzq on 2018/4/4.
 */
public class ClassD {

    private ClassA classA = new ClassA();
    private ClassC classC = new ClassC();


    //复杂的逻辑
    public void doSomethingD() {
        this.classA.doSomethingA();
        this.classC.doSomethingC();
    }
}
