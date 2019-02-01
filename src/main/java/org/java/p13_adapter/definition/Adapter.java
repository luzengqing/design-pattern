package org.java.p13_adapter.definition;

/**
 * Created by lzq on 2018/4/3.
 * 适配器角色（类适配器）
 * 适配器模式的核心角色，其他两个角色都是已经存在的角色，而适配器角色是需要新建
 立的，它的职责非常简单：把源角色转换为目标角色，怎么转换？通过继承或是关联的方式。
 */
public class Adapter extends Source implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}
