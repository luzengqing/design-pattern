package org.java.p13_adapter.extension;

/**
 * Created by lzq on 2018/4/3.
 * 适配器角色（对象适配器）
 */
public class Adapter implements Target {

    private Source1 source1;

    private Source2 source2;

    //通过构造函数关联原角色对象
    public Adapter(Source1 source1, Source2 source2) {
        this.source1 = source1;
        this.source2 = source2;
    }

    @Override
    public void doSomething1() {
        this.source1.doX1();
    }

    @Override
    public void doSomething2() {
        this.source2.doX2();
    }
}
